package org.onap.ccsdk.sdnr.wt.websocketmanager2.utils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.onap.ccsdk.sdnr.wt.websocketmanager2.WebSocketManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class AkkaConfig{

	private static final Logger LOG = LoggerFactory.getLogger(WebSocketManager.class.getName());
	
	public static class ClusterNodeInfo
	{
		@Override
		public String toString() {
			return "ClusterNodeInfo [protocol=" + protocol + ", clusterName=" + clusterName + ", remoteAdr=" + remoteAdr
					+ ", port=" + port + "]";
		}
		private final String protocol;
		private final String clusterName;
		private final String remoteAdr;
		private final int port;

		public String getRemoteAddress() {return this.remoteAdr;}
		public ClusterNodeInfo(String s) throws Exception
		{
			final String regex ="([a-z.]*):\\/\\/([a-zA-Z0-9-]*)@([a-zA-Z0-9.-]*):([0-9]*)";
			final Pattern pattern = Pattern.compile(regex);
			final Matcher matcher = pattern.matcher(s);
			if(!matcher.find())
				throw new Exception("invalid seedNode format");
			this.protocol=matcher.group(1);
			this.clusterName=matcher.group(2);
			this.remoteAdr=matcher.group(3);
			this.port=Integer.parseInt(matcher.group(4));
		}
	}
	public static class ClusterRoleInfo
	{
		@Override
		public String toString() {
			return "ClusterRoleInfo [Role=" + Role + ", Index=" + Index + "]";
		}

		private final String Role;
		private final int Index;
		public ClusterRoleInfo(String s) throws Exception {
			final String regex = "([a-z]*)-([0-9]*)";
			final Pattern pattern = Pattern.compile(regex);
			final Matcher matcher = pattern.matcher(s);
			if(!matcher.find())
				throw new Exception("invalid role format");
			this.Role=matcher.group(1);
			this.Index=Integer.parseInt(matcher.group(2));
		}

	}
	public static class ClusterConfig
	{
		@Override
		public String toString() {
			return "ClusterConfig [seedNodes=" + seedNodes + ", roles=" + roles + "]";
		}
		private final List<ClusterNodeInfo> seedNodes;
		private final List<ClusterRoleInfo> roles;
		private final ClusterNodeInfo ismeInfo;
		public ClusterConfig(Config o) throws Exception {
			{
			this.seedNodes = new ArrayList<ClusterNodeInfo>();
			List<String> a= o.getStringList("seed-nodes");
			for(int i=0;i<a.size();i++)
			{
				ClusterNodeInfo info=new ClusterNodeInfo(a.get(i));
				this.seedNodes.add(info);
			}
			this.roles=new ArrayList<ClusterRoleInfo>();
			a=o.getStringList("roles");
			for(int i=0;i<a.size();i++)
			{
				ClusterRoleInfo s=new ClusterRoleInfo(a.get(i));
				this.roles.add(s);
			}
			int idx=this.roles.get(0).Index-1;
			if(idx>=0 && idx<this.seedNodes.size())
				this.ismeInfo=this.seedNodes.get(idx);
			else
				this.ismeInfo=null;
		}

	}
		public boolean isCluster() {
			return this.seedNodes!=null?this.seedNodes.size()>1:false;
		}
		public boolean isMe(ClusterNodeInfo i) {
			return this.ismeInfo!=null?this.ismeInfo.equals(i):false;
		}
		public List<ClusterNodeInfo> getSeedNodes() {
			return this.seedNodes;
		}
	}

	private static final String DEFAULT_FILENAME = "configuration/initial/akka.conf";
	private final File file;
	private final String resourceFilename;
	private final String fileContent;
	private ClusterConfig cluserConfig;
	public ClusterConfig getClusterConfig() {return this.cluserConfig;}

	private AkkaConfig(File file,boolean isResource) {
		this.file=isResource?null:file;
		this.fileContent=null;
		this.resourceFilename=isResource?file.getAbsolutePath():null;
	}
	private AkkaConfig(String fileContent) {
		this.file = null;
		this.fileContent = fileContent;
		this.resourceFilename = null;
	}
	
	
	@Override
	public String toString() {
		return "AkkaConfig [filename=" + file + ", cluserConfig=" + cluserConfig + "]";
	}

	private void loadFromFile() throws Exception {
		Config cfg=null;
		if(this.file!=null)
			cfg=ConfigFactory.parseFile(this.file);
		else if(this.fileContent!=null)
			cfg=ConfigFactory.parseString(this.fileContent);
		else if(this.resourceFilename!=null)
			cfg=ConfigFactory.parseResources(this.getClass(), this.resourceFilename);
		
		if(cfg!=null)
			this.cluserConfig=new ClusterConfig(cfg.getConfig("odl-cluster-data").getConfig("akka").getConfig("cluster"));
		else
		{
			LOG.warn("unable to parse config file");
			this.cluserConfig=null;
		}
	}

	public boolean isCluster()
	{
		return this.cluserConfig!=null?this.cluserConfig.isCluster():false;
	}
	public static AkkaConfig load() throws Exception
	{
		return load(DEFAULT_FILENAME);
	}

	public static AkkaConfig load(String filename) throws Exception
	{
		return load(filename,false);
	}
	public static AkkaConfig load(String filename,boolean isResource) throws Exception
	{
		AkkaConfig cfg=new AkkaConfig(new File(filename),isResource);
		cfg.loadFromFile();

		return cfg;
	}





}
