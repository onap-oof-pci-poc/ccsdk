package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Capabilities;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.CellConfig;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.AccessMgmt;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Rem;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Transport;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.FapControl;

/**
 * List of object class FAPService.{i}.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * list fap-service {
 *     key "alias";
 *     leaf alias {
 *         type string;
 *     }
 *     leaf device-type {
 *         type enumeration;
 *     }
 *     leaf dn-prefix {
 *         type string;
 *     }
 *     container capabilities {
 *         leaf gps-equipped {
 *             type boolean;
 *         }
 *         leaf max-tx-power {
 *             type max-tx-power;
 *         }
 *         leaf-list supported-systems {
 *             type enumeration;
 *         }
 *         leaf beacon {
 *             type boolean;
 *         }
 *         container capabilities-umts {
 *             leaf duplex-mode {
 *                 type enumeration;
 *             }
 *             leaf gsm-rx-supported {
 *                 type boolean;
 *             }
 *             leaf hsdpa-supported {
 *                 type boolean;
 *             }
 *             leaf max-hsdpa-data-rate-supported {
 *                 type max-hsdpa-data-rate-supported;
 *             }
 *             leaf hsupa-supported {
 *                 type boolean;
 *             }
 *             leaf max-hsupa-data-rate-supported {
 *                 type max-hsupa-data-rate-supported;
 *             }
 *             leaf max-hspdsc-hs-supported {
 *                 type uint8;
 *             }
 *             leaf max-hsscc-hs-supported {
 *                 type uint64;
 *             }
 *             leaf-list fdd-bands-supported {
 *                 type string;
 *             }
 *             leaf-list gsm-rx-bands-supported {
 *                 type enumeration;
 *             }
 *             container capabilities-umts-self-config {
 *                 leaf uarfcn-config {
 *                     type boolean;
 *                 }
 *                 leaf primary-scrambling-code-config {
 *                     type boolean;
 *                 }
 *                 leaf maxfap-tx-power-expanded-config {
 *                     type boolean;
 *                 }
 *                 leaf pcpich-power-config {
 *                     type boolean;
 *                 }
 *                 leaf max-ul-tx-power-config {
 *                     type boolean;
 *                 }
 *                 leaf lacracura-config {
 *                     type boolean;
 *                 }
 *                 leaf neighbor-list-config {
 *                     type boolean;
 *                 }
 *                 leaf cell-re-selection-config {
 *                     type boolean;
 *                 }
 *                 leaf intra-freq-meas-config {
 *                     type boolean;
 *                 }
 *                 leaf inter-freq-meas-config {
 *                     type boolean;
 *                 }
 *                 leaf inter-rat-meas-config {
 *                     type boolean;
 *                 }
 *                 leaf ue-internal-meas-config {
 *                     type boolean;
 *                 }
 *                 leaf noise-rise-limit-config {
 *                     type boolean;
 *                 }
 *                 uses capabilities-umts-self-config-g;
 *             }
 *             uses capabilities-umts-g;
 *         }
 *         container capabilities-lte {
 *             leaf duplex-mode {
 *                 type enumeration;
 *             }
 *             leaf-list bands-supported {
 *                 type uint8;
 *             }
 *             leaf nnsf-supported {
 *                 type boolean;
 *             }
 *             leaf umts-rx-supported {
 *                 type boolean;
 *             }
 *             leaf-list umts-rx-bands-supported {
 *                 type string;
 *             }
 *             leaf gsm-rx-supported {
 *                 type boolean;
 *             }
 *             leaf-list gsm-rx-bands-supported {
 *                 type enumeration;
 *             }
 *             leaf cdma2000-rx-supported {
 *                 type boolean;
 *             }
 *             leaf-list cdma2000-rx-bands-supported {
 *                 type string;
 *             }
 *             uses capabilities-lte-g;
 *         }
 *         container capabilities-cdma2000 {
 *             leaf remote-ip-access-capable {
 *                 type boolean;
 *             }
 *             leaf-list band-class-supportedfap-beacon {
 *                 type string;
 *             }
 *             container capabilities-cdma2000-one-x {
 *                 leaf band-class-supportedfap {
 *                     type string;
 *                 }
 *                 leaf active-handin-capable {
 *                     type boolean;
 *                 }
 *                 leaf femto-overhead-messages-capable {
 *                     type boolean;
 *                 }
 *                 container capabilities-cdma2000-one-x-self-config {
 *                     leaf rfcnfl-config {
 *                         type boolean;
 *                     }
 *                     leaf pilot-pn-config {
 *                         type boolean;
 *                     }
 *                     leaf maxfap-tx-power-config {
 *                         type boolean;
 *                     }
 *                     leaf maxfap-beacon-tx-power-config {
 *                         type boolean;
 *                     }
 *                     uses capabilities-cdma2000-one-x-self-config-g;
 *                 }
 *                 uses capabilities-cdma2000-one-x-g;
 *             }
 *             container capabilities-cdma2000-hrpd {
 *                 leaf a13-session-transfer-capable {
 *                     type boolean;
 *                 }
 *                 leaf a16-session-transfer-capable {
 *                     type boolean;
 *                 }
 *                 leaf local-ip-access-capable {
 *                     type boolean;
 *                 }
 *                 leaf dedicated-hrpd-beacon {
 *                     type boolean;
 *                 }
 *                 container capabilities-cdma2000-hrpd-self-config {
 *                     leaf rfcnfl-config {
 *                         type boolean;
 *                     }
 *                     leaf pilot-pn-config {
 *                         type boolean;
 *                     }
 *                     leaf maxfap-tx-power-config {
 *                         type boolean;
 *                     }
 *                     leaf maxfap-beacon-tx-power-config {
 *                         type boolean;
 *                     }
 *                     uses capabilities-cdma2000-hrpd-self-config-g;
 *                 }
 *                 uses capabilities-cdma2000-hrpd-g;
 *             }
 *             uses capabilities-cdma2000-g;
 *         }
 *         uses capabilities-g;
 *     }
 *     container fap-control {
 *         leaf-list self-config-events {
 *             type enumeration;
 *         }
 *         leaf enclosure-tampering-detected {
 *             type boolean;
 *         }
 *         container fap-control-umts {
 *             leaf op-state {
 *                 type boolean;
 *             }
 *             leaf admin-state {
 *                 type boolean;
 *             }
 *             leaf rf-tx-status {
 *                 type boolean;
 *             }
 *             leaf pm-config {
 *                 type string;
 *             }
 *             container fap-control-umts-self-config {
 *                 leaf uarfcn-self-config-enable {
 *                     type boolean;
 *                 }
 *                 leaf primary-scrambling-code-self-config-enable {
 *                     type boolean;
 *                 }
 *                 leaf maxfap-tx-power-expanded-self-config-enable {
 *                     type boolean;
 *                 }
 *                 leaf pcpich-power-self-config-enable {
 *                     type boolean;
 *                 }
 *                 leaf max-ul-tx-power-self-config-enable {
 *                     type boolean;
 *                 }
 *                 leaf lacracura-self-config-enable {
 *                     type boolean;
 *                 }
 *                 leaf neighbor-list-self-config-enable {
 *                     type boolean;
 *                 }
 *                 leaf cell-re-selection-self-config-enable {
 *                     type boolean;
 *                 }
 *                 leaf intra-freq-meas-self-config-enable {
 *                     type boolean;
 *                 }
 *                 leaf inter-freq-meas-self-config-enable {
 *                     type boolean;
 *                 }
 *                 leaf inter-rat-meas-self-config-enable {
 *                     type boolean;
 *                 }
 *                 leaf ue-internal-meas-config-enable {
 *                     type boolean;
 *                 }
 *                 leaf noise-rise-limit-config-enable {
 *                     type boolean;
 *                 }
 *                 uses fap-control-umts-self-config-g;
 *             }
 *             container fap-control-umts-gateway {
 *                 leaf sec-gw-server1 {
 *                     type string;
 *                 }
 *                 leaf sec-gw-server2 {
 *                     type string;
 *                 }
 *                 leaf sec-gw-server3 {
 *                     type string;
 *                 }
 *                 leaf fap-gw-server1 {
 *                     type string;
 *                 }
 *                 leaf fap-gw-server2 {
 *                     type string;
 *                 }
 *                 leaf fap-gw-server3 {
 *                     type string;
 *                 }
 *                 leaf fap-gw-port {
 *                     type uint16;
 *                 }
 *                 uses fap-control-umts-gateway-g;
 *             }
 *             uses fap-control-umts-g;
 *         }
 *         container fap-control-lte {
 *             leaf op-state {
 *                 type boolean;
 *             }
 *             leaf admin-state {
 *                 type boolean;
 *             }
 *             leaf rf-tx-status {
 *                 type boolean;
 *             }
 *             leaf pm-config {
 *                 type string;
 *             }
 *             container fap-control-lte-gateway {
 *                 leaf sec-gw-server1 {
 *                     type string;
 *                 }
 *                 leaf sec-gw-server2 {
 *                     type string;
 *                 }
 *                 leaf sec-gw-server3 {
 *                     type string;
 *                 }
 *                 leaf-list s1-sig-link-server-list {
 *                     type string;
 *                 }
 *                 leaf s1-connection-mode {
 *                     type enumeration;
 *                 }
 *                 leaf s1-sig-link-port {
 *                     type uint16;
 *                 }
 *                 uses fap-control-lte-gateway-g;
 *             }
 *             uses fap-control-lte-g;
 *         }
 *         container fap-control-cdma2000 {
 *             leaf home-domain {
 *                 type string;
 *             }
 *             leaf remote-ip-access-enable {
 *                 type boolean;
 *             }
 *             leaf pm-config {
 *                 type string;
 *             }
 *             container fap-control-cdma2000-time {
 *                 leaf local-time-zone {
 *                     type string;
 *                 }
 *                 leaf current-local-time {
 *                     type string;
 *                 }
 *                 leaf leap-seconds {
 *                     type leap-seconds;
 *                 }
 *                 leaf daylight-savings-used {
 *                     type boolean;
 *                 }
 *                 uses fap-control-cdma2000-time-g;
 *             }
 *             container fap-control-cdma2000-one-x {
 *                 leaf admin-state {
 *                     type enumeration;
 *                 }
 *                 leaf op-state {
 *                     type enumeration;
 *                 }
 *                 leaf rf-tx-status {
 *                     type boolean;
 *                 }
 *                 leaf daylight {
 *                     type int64;
 *                 }
 *                 leaf max-p-rev {
 *                     type int64;
 *                 }
 *                 leaf reregister {
 *                     type uint64;
 *                 }
 *                 leaf emergency-session-period {
 *                     type emergency-session-period;
 *                 }
 *                 leaf location-area-code {
 *                     type uint16;
 *                 }
 *                 leaf msc-id {
 *                     type uint64;
 *                 }
 *                 leaf active-handin-enable {
 *                     type boolean;
 *                 }
 *                 container fap-control-cdma2000-one-x-active-handin-measurement {
 *                     leaf active-handin-measurement-enable {
 *                         type boolean;
 *                     }
 *                     leaf active-hand-in-measurement-duration {
 *                         type active-hand-in-measurement-duration;
 *                     }
 *                     leaf measurement-report-threshold {
 *                         type measurement-report-threshold;
 *                     }
 *                     uses fap-control-cdma2000-one-x-active-handin-measurement-g;
 *                 }
 *                 container fap-control-cdma2000-one-x-self-config {
 *                     leaf rfcnfl-self-config-enable {
 *                         type boolean;
 *                     }
 *                     leaf pilot-pn-self-config-enable {
 *                         type boolean;
 *                     }
 *                     leaf maxfap-tx-power-self-config-enable {
 *                         type boolean;
 *                     }
 *                     leaf maxfap-beacon-tx-power-self-config-enable {
 *                         type boolean;
 *                     }
 *                     uses fap-control-cdma2000-one-x-self-config-g;
 *                 }
 *                 uses fap-control-cdma2000-one-x-g;
 *             }
 *             container fap-control-cdma2000-gateway {
 *                 leaf sec-gw-server1 {
 *                     type string;
 *                 }
 *                 leaf sec-gw-server2 {
 *                     type string;
 *                 }
 *                 leaf sec-gw-server3 {
 *                     type string;
 *                 }
 *                 leaf sec-gw-switchover-count {
 *                     type uint64;
 *                 }
 *                 uses fap-control-cdma2000-gateway-g;
 *             }
 *             container fap-control-cdma2000-hrpd {
 *                 leaf op-state {
 *                     type boolean;
 *                 }
 *                 leaf admin-state {
 *                     type boolean;
 *                 }
 *                 leaf rf-tx-status {
 *                     type boolean;
 *                 }
 *                 leaf a13-session-transfer-enable {
 *                     type boolean;
 *                 }
 *                 leaf local-ip-access-enable {
 *                     type boolean;
 *                 }
 *                 container fap-control-cdma2000-hrpd-self-config {
 *                     leaf rfcnfl-self-config-enable {
 *                         type boolean;
 *                     }
 *                     leaf pilot-pn-self-config-enable {
 *                         type boolean;
 *                     }
 *                     leaf maxfap-tx-power-self-config-enable {
 *                         type boolean;
 *                     }
 *                     leaf max-hrpd-beacon-tx-power-self-config-enable {
 *                         type boolean;
 *                     }
 *                     uses fap-control-cdma2000-hrpd-self-config-g;
 *                 }
 *                 container fap-control-cdma2000-hrpd-a13 {
 *                     leaf color-code-to-uati104-number-of-entries {
 *                         type uint64;
 *                     }
 *                     leaf hrpd-subnet-to-ip-number-of-entries {
 *                         type uint64;
 *                     }
 *                     list fap-control-cdma2000-hrpd-a13-color-code-to-uati104 {
 *                         key "color-code" "uati104";
 *                         leaf enable {
 *                             type boolean;
 *                         }
 *                         leaf alias {
 *                             type string;
 *                         }
 *                         leaf color-code {
 *                             type uint16;
 *                         }
 *                         leaf uati104 {
 *                             type binary;
 *                         }
 *                         uses fap-control-cdma2000-hrpd-a13-color-code-to-uati104-g;
 *                     }
 *                     list fap-control-cdma2000-hrpd-a13-hrpd-subnet-to-ip {
 *                         key "a13-ip-address";
 *                         leaf enable {
 *                             type boolean;
 *                         }
 *                         leaf alias {
 *                             type string;
 *                         }
 *                         leaf hrpd-subnet-length {
 *                             type hrpd-subnet-length;
 *                         }
 *                         leaf hrpd-subnet {
 *                             type binary;
 *                         }
 *                         leaf a13-ip-address {
 *                             type ip-address;
 *                         }
 *                         uses fap-control-cdma2000-hrpd-a13-hrpd-subnet-to-ip-g;
 *                     }
 *                     uses fap-control-cdma2000-hrpd-a13-g;
 *                 }
 *                 uses fap-control-cdma2000-hrpd-g;
 *             }
 *             uses fap-control-cdma2000-g;
 *         }
 *         uses fap-control-g;
 *     }
 *     container access-mgmt {
 *         container access-mgmt-umts {
 *             leaf access-mode {
 *                 type access-mode;
 *             }
 *             leaf non-csgue-access-decision {
 *                 type non-csgue-access-decision;
 *             }
 *             leaf csg-membership-determined-locally {
 *                 type csg-membership-determined-locally;
 *             }
 *             leaf max-u-es-served {
 *                 type max-u-es-served;
 *             }
 *             leaf max-csg-members {
 *                 type max-csg-members;
 *             }
 *             leaf max-non-csg-members {
 *                 type max-non-csg-members;
 *             }
 *             leaf max-resource-non-csg-members {
 *                 type uint8;
 *             }
 *             leaf hnb-name {
 *                 type string;
 *             }
 *             leaf csgid {
 *                 type uint32;
 *             }
 *             leaf-list access-control-list {
 *                 type string;
 *             }
 *             leaf max-member-detail-entries {
 *                 type uint64;
 *             }
 *             leaf member-detail-number-of-entries {
 *                 type uint64;
 *             }
 *             list access-mgmt-umts-member-detail {
 *                 key "imsi";
 *                 leaf enable {
 *                     type boolean;
 *                 }
 *                 leaf alias {
 *                     type string;
 *                 }
 *                 leaf imsi {
 *                     type string;
 *                 }
 *                 leaf msisdn {
 *                     type string;
 *                 }
 *                 leaf membership-expires {
 *                     type date-and-time;
 *                 }
 *                 uses access-mgmt-umts-member-detail-g;
 *             }
 *             container access-mgmt-umts-local-ip-access {
 *                 leaf enable {
 *                     type enable;
 *                 }
 *                 uses access-mgmt-umts-local-ip-access-g;
 *             }
 *             uses access-mgmt-umts-g;
 *         }
 *         container access-mgmt-lte {
 *             leaf access-mode {
 *                 type access-mode;
 *             }
 *             leaf max-u-es-served {
 *                 type max-u-es-served;
 *             }
 *             leaf max-csg-members {
 *                 type max-csg-members;
 *             }
 *             leaf max-non-csg-members {
 *                 type max-non-csg-members;
 *             }
 *             leaf max-resource-non-csg-members {
 *                 type uint8;
 *             }
 *             leaf csgid {
 *                 type uint32;
 *             }
 *             leaf hnb-name {
 *                 type string;
 *             }
 *             container access-mgmt-lte-local-ip-access {
 *                 leaf enable {
 *                     type enable;
 *                 }
 *                 uses access-mgmt-lte-local-ip-access-g;
 *             }
 *             uses access-mgmt-lte-g;
 *         }
 *         container access-mgmt-cdma2000 {
 *             leaf access-mode {
 *                 type uint8;
 *             }
 *             leaf max-total-active-calls-allowed {
 *                 type uint16;
 *             }
 *             leaf access-control-list {
 *                 type string;
 *             }
 *             leaf max-member-detail-entries {
 *                 type uint64;
 *             }
 *             leaf member-detail-number-of-entries {
 *                 type uint64;
 *             }
 *             list access-mgmt-cdma2000-member-detail {
 *                 key "imsi";
 *                 leaf enable {
 *                     type boolean;
 *                 }
 *                 leaf alias {
 *                     type string;
 *                 }
 *                 leaf imsi {
 *                     type string;
 *                 }
 *                 leaf hrpd-identifier-type {
 *                     type int64;
 *                 }
 *                 leaf hrpd-identifier-value {
 *                     type string;
 *                 }
 *                 leaf membership-expires {
 *                     type date-and-time;
 *                 }
 *                 uses access-mgmt-cdma2000-member-detail-g;
 *             }
 *             container access-mgmt-cdma2000-local-ip-access {
 *                 container access-mgmt-cdma2000-local-ip-access-hrpd {
 *                     leaf filter-type {
 *                         type uint8;
 *                     }
 *                     leaf filter-in-use {
 *                         type string;
 *                     }
 *                     leaf egress-filter-number-of-entries {
 *                         type uint64;
 *                     }
 *                     list access-mgmt-cdma2000-local-ip-access-hrpd-egress-filter {
 *                         key "subnet" "subnet-mask";
 *                         leaf enable {
 *                             type boolean;
 *                         }
 *                         leaf alias {
 *                             type string;
 *                         }
 *                         leaf subnet {
 *                             type ipv4-address;
 *                         }
 *                         leaf subnet-mask {
 *                             type uint8;
 *                         }
 *                         uses access-mgmt-cdma2000-local-ip-access-hrpd-egress-filter-g;
 *                     }
 *                     uses access-mgmt-cdma2000-local-ip-access-hrpd-g;
 *                 }
 *                 uses access-mgmt-cdma2000-local-ip-access-g;
 *             }
 *             uses access-mgmt-cdma2000-g;
 *         }
 *         container access-mgmt-legacy {
 *             container access-mgmt-legacy-local-ip-access {
 *                 leaf enable {
 *                     type enable;
 *                 }
 *                 leaf max-rules-entries {
 *                     type uint64;
 *                 }
 *                 leaf rule-number-of-entries {
 *                     type uint64;
 *                 }
 *                 list access-mgmt-legacy-local-ip-access-rule {
 *                     key "dest-ip-address" "dest-subnet-mask" "protocol";
 *                     leaf enable {
 *                         type boolean;
 *                     }
 *                     leaf alias {
 *                         type string;
 *                     }
 *                     leaf dest-ip-address {
 *                         type ip-address;
 *                     }
 *                     leaf dest-subnet-mask {
 *                         type ip-address;
 *                     }
 *                     leaf protocol {
 *                         type int64;
 *                     }
 *                     leaf action {
 *                         type enumeration;
 *                     }
 *                     leaf interface {
 *                         type string;
 *                     }
 *                     uses access-mgmt-legacy-local-ip-access-rule-g;
 *                 }
 *                 uses access-mgmt-legacy-local-ip-access-g;
 *             }
 *             uses access-mgmt-legacy-g;
 *         }
 *         uses access-mgmt-g;
 *     }
 *     container cell-config {
 *         container umts {
 *             leaf tunnel-instance {
 *                 type string;
 *             }
 *             container umts-cn {
 *                 leaf plmn-type {
 *                     type enumeration;
 *                 }
 *                 leaf plmnid {
 *                     type string;
 *                 }
 *                 leaf-list equiv-plmnid {
 *                     type string;
 *                 }
 *                 leaf sac {
 *                     type uint16;
 *                 }
 *                 leaf broadcast-sac {
 *                     type uint16;
 *                 }
 *                 leaf-list lacrac {
 *                     type string;
 *                 }
 *                 leaf lac-in-use {
 *                     type uint16;
 *                 }
 *                 leaf rac-in-use {
 *                     type uint8;
 *                 }
 *                 container umts-cn-cs-domain {
 *                     leaf t3212 {
 *                         type t3212;
 *                     }
 *                     leaf imsi-attach-detach-enable {
 *                         type boolean;
 *                     }
 *                     uses umts-cn-cs-domain-g;
 *                 }
 *                 container umts-cn-ps-domain {
 *                     leaf network-mode-operation-combined {
 *                         type boolean;
 *                     }
 *                     uses umts-cn-ps-domain-g;
 *                 }
 *                 uses umts-cn-g;
 *             }
 *             container umts-ran {
 *                 leaf-list ura-list {
 *                     type uint16;
 *                 }
 *                 leaf ura-in-use {
 *                     type uint16;
 *                 }
 *                 leaf rncid {
 *                     type uint16;
 *                 }
 *                 leaf cell-id {
 *                     type uint32;
 *                 }
 *                 leaf t-rat-c {
 *                     type t-rat-c;
 *                 }
 *                 leaf t-raf-c {
 *                     type t-raf-c;
 *                 }
 *                 leaf n-raf-c {
 *                     type uint64;
 *                 }
 *                 leaf tig-or {
 *                     type tig-or;
 *                 }
 *                 leaf tin-tr {
 *                     type tin-tr;
 *                 }
 *                 leaf t-data-fwd {
 *                     type t-data-fwd;
 *                 }
 *                 leaf t-reloc-prep {
 *                     type t-reloc-prep;
 *                 }
 *                 leaf t-reloc-overall {
 *                     type t-reloc-overall;
 *                 }
 *                 leaf hnbid-realm {
 *                     type string;
 *                 }
 *                 leaf hs-flag {
 *                     type boolean;
 *                 }
 *                 leaf hs-enable {
 *                     type boolean;
 *                 }
 *                 leaf num-of-hspdsc-hs {
 *                     type uint8;
 *                 }
 *                 leaf num-of-hsscc-hs {
 *                     type uint64;
 *                 }
 *                 container umts-ran-csg {
 *                     leaf csg-indicator {
 *                         type boolean;
 *                     }
 *                     leaf-list uarfcndl-list {
 *                         type uint16;
 *                     }
 *                     container umts-ran-csg-csgpsc-split-info {
 *                         leaf start-psc-range1-coefficient {
 *                             type uint8;
 *                         }
 *                         leaf number-of-ps-cs {
 *                             type enumeration;
 *                         }
 *                         leaf psc-range2-offset {
 *                             type uint8;
 *                         }
 *                         uses umts-ran-csg-csgpsc-split-info-g;
 *                     }
 *                     uses umts-ran-csg-g;
 *                 }
 *                 container umts-ran-cell-selection {
 *                     leaf quality-measure-cpich {
 *                         type enumeration;
 *                     }
 *                     leaf qqual-min {
 *                         type qqual-min;
 *                     }
 *                     leaf qqual-min-offset {
 *                         type qqual-min-offset;
 *                     }
 *                     leaf q-rx-lev-min {
 *                         type q-rx-lev-min;
 *                     }
 *                     leaf delta-q-rx-lev-min {
 *                         type delta-q-rx-lev-min;
 *                     }
 *                     leaf q-rx-lev-min-offset {
 *                         type q-rx-lev-min-offset;
 *                     }
 *                     leaf q-hyst1s {
 *                         type uint8;
 *                     }
 *                     leaf q-hyst2s {
 *                         type uint8;
 *                     }
 *                     leaf t-reselections {
 *                         type t-reselections;
 *                     }
 *                     leaf s-intrasearch {
 *                         type int64;
 *                     }
 *                     leaf s-intersearch {
 *                         type int64;
 *                     }
 *                     leaf s-search-hcs {
 *                         type int64;
 *                     }
 *                     leaf s-search-rat {
 *                         type int64;
 *                     }
 *                     leaf shcsrat {
 *                         type int64;
 *                     }
 *                     leaf s-limit-search-rat {
 *                         type int64;
 *                     }
 *                     leaf non-hcstcr-max {
 *                         type enumeration;
 *                     }
 *                     leaf non-hcsncr {
 *                         type uint8;
 *                     }
 *                     leaf non-hcstcr-max-hyst {
 *                         type enumeration;
 *                     }
 *                     leaf qhcs {
 *                         type qhcs;
 *                     }
 *                     leaf use-of-hcs {
 *                         type boolean;
 *                     }
 *                     leaf hcs-prio {
 *                         type hcs-prio;
 *                     }
 *                     leaf tcr-max {
 *                         type enumeration;
 *                     }
 *                     leaf ncr {
 *                         type uint8;
 *                     }
 *                     leaf tcr-max-hyst {
 *                         type enumeration;
 *                     }
 *                     leaf ue-tx-pwr-max-rach {
 *                         type ue-tx-pwr-max-rach;
 *                     }
 *                     uses umts-ran-cell-selection-g;
 *                 }
 *                 container umts-ran-rrc-timers {
 *                     leaf t300 {
 *                         type t300;
 *                     }
 *                     leaf t301 {
 *                         type t301;
 *                     }
 *                     leaf t302 {
 *                         type t302;
 *                     }
 *                     leaf t304 {
 *                         type t304;
 *                     }
 *                     leaf t305 {
 *                         type t305;
 *                     }
 *                     leaf t307 {
 *                         type t307;
 *                     }
 *                     leaf t308 {
 *                         type t308;
 *                     }
 *                     leaf t309 {
 *                         type t309;
 *                     }
 *                     leaf t310 {
 *                         type t310;
 *                     }
 *                     leaf t311 {
 *                         type t311;
 *                     }
 *                     leaf t312 {
 *                         type t312;
 *                     }
 *                     leaf t313 {
 *                         type t313;
 *                     }
 *                     leaf t314 {
 *                         type t314;
 *                     }
 *                     leaf t315 {
 *                         type t315;
 *                     }
 *                     leaf t316 {
 *                         type t316;
 *                     }
 *                     leaf t317 {
 *                         type t317;
 *                     }
 *                     leaf n300 {
 *                         type n300;
 *                     }
 *                     leaf n301 {
 *                         type n301;
 *                     }
 *                     leaf n302 {
 *                         type n302;
 *                     }
 *                     leaf n304 {
 *                         type n304;
 *                     }
 *                     leaf n310 {
 *                         type n310;
 *                     }
 *                     leaf n312 {
 *                         type n312;
 *                     }
 *                     leaf n313 {
 *                         type n313;
 *                     }
 *                     leaf n315 {
 *                         type n315;
 *                     }
 *                     leaf wait-time {
 *                         type wait-time;
 *                     }
 *                     uses umts-ran-rrc-timers-g;
 *                 }
 *                 container umts-ran-drx {
 *                     leaf drx-cycle-length-coefficient-cs {
 *                         type uint8;
 *                     }
 *                     leaf drx-cycle-length-coefficient-ps {
 *                         type uint8;
 *                     }
 *                     leaf utrandrx-cycle-length-coefficient {
 *                         type uint8;
 *                     }
 *                     uses umts-ran-drx-g;
 *                 }
 *                 container umts-ran-power-control {
 *                     leaf constant-value {
 *                         type constant-value;
 *                     }
 *                     leaf power-ramp-step-up {
 *                         type power-ramp-step-up;
 *                     }
 *                     leaf preamble-retrans-max {
 *                         type uint8;
 *                     }
 *                     leaf persistence-scale-factor {
 *                         type uint8;
 *                     }
 *                     leaf m-max {
 *                         type uint8;
 *                     }
 *                     leaf nb01-min {
 *                         type uint8;
 *                     }
 *                     leaf nb01-max {
 *                         type uint8;
 *                     }
 *                     uses umts-ran-power-control-g;
 *                 }
 *                 container umts-ran-cell-restriction {
 *                     leaf cell-barred {
 *                         type boolean;
 *                     }
 *                     leaf intra-freq-cell-reselection-indicator {
 *                         type boolean;
 *                     }
 *                     leaf t-barred {
 *                         type t-barred;
 *                     }
 *                     leaf-list access-class-barred-list-cs {
 *                         type uint8;
 *                     }
 *                     leaf-list access-class-barred-list-ps {
 *                         type uint8;
 *                     }
 *                     leaf cell-reserved-for-operator-use {
 *                         type boolean;
 *                     }
 *                     uses umts-ran-cell-restriction-g;
 *                 }
 *                 container umts-ran-intra-freq-meas {
 *                     leaf measurement-quantity {
 *                         type enumeration;
 *                     }
 *                     leaf filter-coefficient {
 *                         type uint8;
 *                     }
 *                     leaf-list intra-frequency-event-identity {
 *                         type string;
 *                     }
 *                     leaf-list triggering-condition2-event1a {
 *                         type enumeration;
 *                     }
 *                     leaf-list triggering-condition1-event1b {
 *                         type enumeration;
 *                     }
 *                     leaf-list triggering-condition2-event1e {
 *                         type enumeration;
 *                     }
 *                     leaf-list triggering-condition1-event1f {
 *                         type enumeration;
 *                     }
 *                     leaf reporting-range-event1a {
 *                         type reporting-range-event1a;
 *                     }
 *                     leaf reporting-range-event1b {
 *                         type reporting-range-event1b;
 *                     }
 *                     leaf weighting-factor-event1a {
 *                         type uint8;
 *                     }
 *                     leaf weighting-factor-event1b {
 *                         type uint8;
 *                     }
 *                     leaf report-deactivation-threshold-event1a {
 *                         type uint8;
 *                     }
 *                     leaf reporting-amount-event1a {
 *                         type int64;
 *                     }
 *                     leaf reporting-amount-event1c {
 *                         type int64;
 *                     }
 *                     leaf reporting-interval-event1a {
 *                         type reporting-interval-event1a;
 *                     }
 *                     leaf reporting-interval-event1c {
 *                         type reporting-interval-event1c;
 *                     }
 *                     leaf hysteresis-event1a {
 *                         type uint8;
 *                     }
 *                     leaf hysteresis-event1b {
 *                         type uint8;
 *                     }
 *                     leaf hysteresis-event1c {
 *                         type uint8;
 *                     }
 *                     leaf hysteresis-event1d {
 *                         type uint8;
 *                     }
 *                     leaf hysteresis-event1e {
 *                         type uint8;
 *                     }
 *                     leaf hysteresis-event1f {
 *                         type uint8;
 *                     }
 *                     leaf time-to-trigger-event1a {
 *                         type time-to-trigger-event1a;
 *                     }
 *                     leaf time-to-trigger-event1b {
 *                         type time-to-trigger-event1b;
 *                     }
 *                     leaf time-to-trigger-event1c {
 *                         type time-to-trigger-event1c;
 *                     }
 *                     leaf time-to-trigger-event1d {
 *                         type time-to-trigger-event1d;
 *                     }
 *                     leaf time-to-trigger-event1e {
 *                         type time-to-trigger-event1e;
 *                     }
 *                     leaf time-to-trigger-event1f {
 *                         type time-to-trigger-event1f;
 *                     }
 *                     leaf threshold-used-frequency-event1e {
 *                         type int64;
 *                     }
 *                     leaf threshold-used-frequency-event1f {
 *                         type int64;
 *                     }
 *                     leaf replacement-activation-threshold-event1c {
 *                         type uint8;
 *                     }
 *                     leaf instance-number-of-entries {
 *                         type uint64;
 *                     }
 *                     list umts-ran-intra-freq-meas-instance {
 *                         key "intra-frequency-event-identity";
 *                         leaf enable {
 *                             type boolean;
 *                         }
 *                         leaf alias {
 *                             type string;
 *                         }
 *                         leaf intra-frequency-event-identity {
 *                             type enumeration;
 *                         }
 *                         leaf event-description {
 *                             type string;
 *                         }
 *                         leaf measurement-quantity {
 *                             type enumeration;
 *                         }
 *                         leaf filter-coefficient {
 *                             type uint8;
 *                         }
 *                         leaf-list triggering-condition {
 *                             type enumeration;
 *                         }
 *                         leaf reporting-range {
 *                             type reporting-range;
 *                         }
 *                         leaf weighting-factor {
 *                             type uint8;
 *                         }
 *                         leaf report-deactivation-threshold {
 *                             type uint8;
 *                         }
 *                         leaf reporting-amount {
 *                             type int64;
 *                         }
 *                         leaf reporting-interval {
 *                             type reporting-interval;
 *                         }
 *                         leaf hysteresis {
 *                             type uint8;
 *                         }
 *                         leaf time-to-trigger {
 *                             type time-to-trigger;
 *                         }
 *                         leaf threshold-used-frequency {
 *                             type int64;
 *                         }
 *                         leaf replacement-activation-threshold {
 *                             type uint8;
 *                         }
 *                         uses umts-ran-intra-freq-meas-instance-g;
 *                     }
 *                     uses umts-ran-intra-freq-meas-g;
 *                 }
 *                 container umts-ran-inter-freq-meas {
 *                     leaf measurement-quantity {
 *                         type enumeration;
 *                     }
 *                     leaf filter-coefficient {
 *                         type uint8;
 *                     }
 *                     leaf-list inter-frequency-event-identity {
 *                         type string;
 *                     }
 *                     leaf weighting-factor-event2a {
 *                         type uint8;
 *                     }
 *                     leaf weighting-factor-event2b {
 *                         type uint8;
 *                     }
 *                     leaf weighting-factor-event2d {
 *                         type uint8;
 *                     }
 *                     leaf weighting-factor-event2f {
 *                         type uint8;
 *                     }
 *                     leaf hysteresis-event2a {
 *                         type uint8;
 *                     }
 *                     leaf hysteresis-event2b {
 *                         type uint8;
 *                     }
 *                     leaf hysteresis-event2d {
 *                         type uint8;
 *                     }
 *                     leaf hysteresis-event2f {
 *                         type uint8;
 *                     }
 *                     leaf time-to-trigger-event2a {
 *                         type time-to-trigger-event2a;
 *                     }
 *                     leaf time-to-trigger-event2b {
 *                         type time-to-trigger-event2b;
 *                     }
 *                     leaf time-to-trigger-event2d {
 *                         type time-to-trigger-event2d;
 *                     }
 *                     leaf time-to-trigger-event2f {
 *                         type time-to-trigger-event2f;
 *                     }
 *                     leaf threshold-used-frequency-event2b {
 *                         type int64;
 *                     }
 *                     leaf threshold-used-frequency-event2d {
 *                         type int64;
 *                     }
 *                     leaf threshold-used-frequency-event2f {
 *                         type int64;
 *                     }
 *                     leaf instance-number-of-entries {
 *                         type uint64;
 *                     }
 *                     list umts-ran-inter-freq-meas-instance {
 *                         key "intra-frequency-event-identity";
 *                         leaf enable {
 *                             type boolean;
 *                         }
 *                         leaf alias {
 *                             type string;
 *                         }
 *                         leaf intra-frequency-event-identity {
 *                             type enumeration;
 *                         }
 *                         leaf event-description {
 *                             type string;
 *                         }
 *                         leaf measurement-quantity {
 *                             type enumeration;
 *                         }
 *                         leaf filter-coefficient {
 *                             type uint8;
 *                         }
 *                         leaf weighting-factor {
 *                             type uint8;
 *                         }
 *                         leaf hysteresis {
 *                             type uint8;
 *                         }
 *                         leaf time-to-trigger {
 *                             type time-to-trigger;
 *                         }
 *                         leaf threshold-used-frequency {
 *                             type int64;
 *                         }
 *                         leaf threshold-non-used-frequency {
 *                             type int64;
 *                         }
 *                         uses umts-ran-inter-freq-meas-instance-g;
 *                     }
 *                     uses umts-ran-inter-freq-meas-g;
 *                 }
 *                 container umts-ran-inter-rat-meas {
 *                     leaf gsm-filter-coefficient {
 *                         type uint8;
 *                     }
 *                     leaf bsic-verification-required {
 *                         type boolean;
 *                     }
 *                     leaf weighting-factor {
 *                         type uint8;
 *                     }
 *                     leaf hysteresis {
 *                         type uint8;
 *                     }
 *                     leaf time-to-trigger {
 *                         type time-to-trigger;
 *                     }
 *                     leaf threshold-own-system {
 *                         type int64;
 *                     }
 *                     leaf threshold-other-system {
 *                         type int64;
 *                     }
 *                     leaf instance-number-of-entries {
 *                         type uint64;
 *                     }
 *                     list umts-ran-inter-rat-meas-instance {
 *                         key "inter-rat-event-identity";
 *                         leaf enable {
 *                             type boolean;
 *                         }
 *                         leaf alias {
 *                             type string;
 *                         }
 *                         leaf inter-rat-event-identity {
 *                             type enumeration;
 *                         }
 *                         leaf event-description {
 *                             type string;
 *                         }
 *                         leaf filter-coefficient {
 *                             type uint8;
 *                         }
 *                         leaf bsic-verification-required {
 *                             type boolean;
 *                         }
 *                         leaf weighting-factor {
 *                             type uint8;
 *                         }
 *                         leaf hysteresis {
 *                             type uint8;
 *                         }
 *                         leaf time-to-trigger {
 *                             type time-to-trigger;
 *                         }
 *                         leaf threshold-own-system {
 *                             type int64;
 *                         }
 *                         leaf threshold-other-system {
 *                             type int64;
 *                         }
 *                         uses umts-ran-inter-rat-meas-instance-g;
 *                     }
 *                     uses umts-ran-inter-rat-meas-g;
 *                 }
 *                 container umts-ran-ue-internal-meas {
 *                     leaf filter-coefficient {
 *                         type uint8;
 *                     }
 *                     leaf ue-tx-pwr-threshold-event6a {
 *                         type ue-tx-pwr-threshold-event6a;
 *                     }
 *                     leaf time-to-trigger-event6a {
 *                         type time-to-trigger-event6a;
 *                     }
 *                     leaf ue-tx-pwr-threshold-event6b {
 *                         type ue-tx-pwr-threshold-event6b;
 *                     }
 *                     leaf time-to-trigger-event6b {
 *                         type time-to-trigger-event6b;
 *                     }
 *                     uses umts-ran-ue-internal-meas-g;
 *                 }
 *                 container umts-ran-rf {
 *                     leaf-list uarfcndl {
 *                         type string;
 *                     }
 *                     leaf uarfcndl-in-use {
 *                         type uint64;
 *                     }
 *                     leaf uarfcnul-in-use {
 *                         type uint64;
 *                     }
 *                     leaf-list uarfcndl-to-protect {
 *                         type string;
 *                     }
 *                     leaf-list primary-scrambling-code {
 *                         type string;
 *                     }
 *                     leaf primary-scrambling-code-in-use {
 *                         type uint64;
 *                     }
 *                     leaf maxfap-tx-power-expanded {
 *                         type string;
 *                     }
 *                     leaf maxfap-tx-power-in-use-expanded {
 *                         type maxfap-tx-power-in-use-expanded;
 *                     }
 *                     leaf max-ul-tx-power {
 *                         type string;
 *                     }
 *                     leaf max-ul-tx-power-in-use {
 *                         type max-ul-tx-power-in-use;
 *                     }
 *                     leaf pcpich-power {
 *                         type string;
 *                     }
 *                     leaf pcpich-power-in-use {
 *                         type pcpich-power-in-use;
 *                     }
 *                     leaf power-offset-pilot-dpdch {
 *                         type power-offset-pilot-dpdch;
 *                     }
 *                     leaf fap-coverage-target {
 *                         type fap-coverage-target;
 *                     }
 *                     leaf fap-quality-target-ec-io {
 *                         type fap-quality-target-ec-io;
 *                     }
 *                     leaf psch-power {
 *                         type psch-power;
 *                     }
 *                     leaf ssch-power {
 *                         type ssch-power;
 *                     }
 *                     leaf pich-power {
 *                         type pich-power;
 *                     }
 *                     leaf pch-power {
 *                         type pch-power;
 *                     }
 *                     leaf fach-power {
 *                         type fach-power;
 *                     }
 *                     leaf bch-power {
 *                         type bch-power;
 *                     }
 *                     leaf aich-power {
 *                         type aich-power;
 *                     }
 *                     leaf ctch-allocation-period {
 *                         type uint8;
 *                     }
 *                     leaf cbs-frame-offset {
 *                         type uint8;
 *                     }
 *                     leaf max-tti {
 *                         type uint8;
 *                     }
 *                     leaf noise-rise-limit-lower-value {
 *                         type uint16;
 *                     }
 *                     leaf noise-rise-limit-upper-value {
 *                         type uint16;
 *                     }
 *                     leaf noise-rise-limit-in-use {
 *                         type uint16;
 *                     }
 *                     uses umts-ran-rf-g;
 *                 }
 *                 container umts-ran-neighbor-list {
 *                     leaf max-intra-freq-cell-entries {
 *                         type uint64;
 *                     }
 *                     leaf max-inter-freq-cell-entries {
 *                         type uint64;
 *                     }
 *                     leaf intra-freq-cell-number-of-entries {
 *                         type uint64;
 *                     }
 *                     leaf inter-freq-cell-number-of-entries {
 *                         type uint64;
 *                     }
 *                     list umts-ran-neighbor-list-intra-freq-cell {
 *                         key "pcpich-scrambling-code";
 *                         leaf enable {
 *                             type boolean;
 *                         }
 *                         leaf alias {
 *                             type string;
 *                         }
 *                         leaf must-include {
 *                             type boolean;
 *                         }
 *                         leaf plmnid {
 *                             type string;
 *                         }
 *                         leaf rncid {
 *                             type uint16;
 *                         }
 *                         leaf cid {
 *                             type uint16;
 *                         }
 *                         leaf lac {
 *                             type uint16;
 *                         }
 *                         leaf rac {
 *                             type uint8;
 *                         }
 *                         leaf ura {
 *                             type uint16;
 *                         }
 *                         leaf pcpich-scrambling-code {
 *                             type uint16;
 *                         }
 *                         leaf pcpich-tx-power {
 *                             type pcpich-tx-power;
 *                         }
 *                         leaf collocated-inter-freq-cell {
 *                             type uint32;
 *                         }
 *                         leaf max-tx-power {
 *                             type max-tx-power;
 *                         }
 *                         leaf max-dpc-htx-power {
 *                             type max-dpc-htx-power;
 *                         }
 *                         uses umts-ran-neighbor-list-intra-freq-cell-g;
 *                     }
 *                     list umts-ran-neighbor-list-inter-freq-cell {
 *                         key "pcpich-scrambling-code" "uarfcndl";
 *                         leaf enable {
 *                             type boolean;
 *                         }
 *                         leaf alias {
 *                             type string;
 *                         }
 *                         leaf must-include {
 *                             type boolean;
 *                         }
 *                         leaf plmnid {
 *                             type string;
 *                         }
 *                         leaf rncid {
 *                             type uint16;
 *                         }
 *                         leaf cid {
 *                             type uint16;
 *                         }
 *                         leaf lac {
 *                             type uint16;
 *                         }
 *                         leaf rac {
 *                             type uint8;
 *                         }
 *                         leaf ura {
 *                             type uint16;
 *                         }
 *                         leaf uarfcnul {
 *                             type uint16;
 *                         }
 *                         leaf uarfcndl {
 *                             type uint16;
 *                         }
 *                         leaf pcpich-scrambling-code {
 *                             type uint16;
 *                         }
 *                         leaf pcpich-tx-power {
 *                             type pcpich-tx-power;
 *                         }
 *                         uses umts-ran-neighbor-list-inter-freq-cell-g;
 *                     }
 *                     container umts-ran-neighbor-list-inter-rat-cell {
 *                         leaf max-gsm-entries {
 *                             type uint64;
 *                         }
 *                         leaf gsm-number-of-entries {
 *                             type uint64;
 *                         }
 *                         list umts-ran-neighbor-list-inter-rat-cell-gsm {
 *                             key "bccharfcn";
 *                             leaf enable {
 *                                 type boolean;
 *                             }
 *                             leaf alias {
 *                                 type string;
 *                             }
 *                             leaf must-include {
 *                                 type boolean;
 *                             }
 *                             leaf plmnid {
 *                                 type string;
 *                             }
 *                             leaf lac {
 *                                 type uint16;
 *                             }
 *                             leaf bsic {
 *                                 type uint8;
 *                             }
 *                             leaf ci {
 *                                 type uint16;
 *                             }
 *                             leaf band-indicator {
 *                                 type enumeration;
 *                             }
 *                             leaf bccharfcn {
 *                                 type uint16;
 *                             }
 *                             uses umts-ran-neighbor-list-inter-rat-cell-gsm-g;
 *                         }
 *                         uses umts-ran-neighbor-list-inter-rat-cell-g;
 *                     }
 *                     uses umts-ran-neighbor-list-g;
 *                 }
 *                 container umts-ran-neighbor-list-in-use {
 *                     leaf max-intra-freq-cell-entries {
 *                         type uint64;
 *                     }
 *                     leaf max-inter-freq-cell-entries {
 *                         type uint64;
 *                     }
 *                     leaf intra-freq-cell-number-of-entries {
 *                         type uint64;
 *                     }
 *                     leaf inter-freq-cell-number-of-entries {
 *                         type uint64;
 *                     }
 *                     list umts-ran-neighbor-list-in-use-intra-freq-cell {
 *                         key "pcpich-scrambling-code";
 *                         leaf plmnid {
 *                             type string;
 *                         }
 *                         leaf rncid {
 *                             type uint16;
 *                         }
 *                         leaf cid {
 *                             type uint16;
 *                         }
 *                         leaf lac {
 *                             type uint16;
 *                         }
 *                         leaf rac {
 *                             type uint8;
 *                         }
 *                         leaf ura {
 *                             type uint16;
 *                         }
 *                         leaf pcpich-scrambling-code {
 *                             type uint16;
 *                         }
 *                         uses umts-ran-neighbor-list-in-use-intra-freq-cell-g;
 *                     }
 *                     list umts-ran-neighbor-list-in-use-inter-freq-cell {
 *                         key "pcpich-scrambling-code" "uarfcndl";
 *                         leaf plmnid {
 *                             type string;
 *                         }
 *                         leaf rncid {
 *                             type uint16;
 *                         }
 *                         leaf cid {
 *                             type uint16;
 *                         }
 *                         leaf lac {
 *                             type uint16;
 *                         }
 *                         leaf rac {
 *                             type uint8;
 *                         }
 *                         leaf ura {
 *                             type uint16;
 *                         }
 *                         leaf uarfcnul {
 *                             type uint16;
 *                         }
 *                         leaf uarfcndl {
 *                             type uint16;
 *                         }
 *                         leaf pcpich-scrambling-code {
 *                             type uint16;
 *                         }
 *                         uses umts-ran-neighbor-list-in-use-inter-freq-cell-g;
 *                     }
 *                     container umts-ran-neighbor-list-in-use-inter-rat-cell {
 *                         leaf max-gsm-entries {
 *                             type uint64;
 *                         }
 *                         leaf gsm-number-of-entries {
 *                             type uint64;
 *                         }
 *                         list umts-ran-neighbor-list-in-use-inter-rat-cell-gsm {
 *                             key "bccharfcn";
 *                             leaf plmnid {
 *                                 type string;
 *                             }
 *                             leaf lac {
 *                                 type uint16;
 *                             }
 *                             leaf bsic {
 *                                 type uint8;
 *                             }
 *                             leaf ci {
 *                                 type uint16;
 *                             }
 *                             leaf band-indicator {
 *                                 type enumeration;
 *                             }
 *                             leaf bccharfcn {
 *                                 type uint16;
 *                             }
 *                             uses umts-ran-neighbor-list-in-use-inter-rat-cell-gsm-g;
 *                         }
 *                         uses umts-ran-neighbor-list-in-use-inter-rat-cell-g;
 *                     }
 *                     uses umts-ran-neighbor-list-in-use-g;
 *                 }
 *                 uses umts-ran-g;
 *             }
 *             container umts-rab {
 *                 leaf rab-succ-estab-cs {
 *                     type uint64;
 *                 }
 *                 leaf rab-fail-estab-cs {
 *                     type uint64;
 *                 }
 *                 leaf rab-succ-estab-ps {
 *                     type uint64;
 *                 }
 *                 leaf rab-fail-estab-ps {
 *                     type uint64;
 *                 }
 *                 leaf rabcs-setup-time-mean {
 *                     type rabcs-setup-time-mean;
 *                 }
 *                 leaf rabcs-setup-time-max {
 *                     type rabcs-setup-time-max;
 *                 }
 *                 leaf rabps-setup-time-mean {
 *                     type rabps-setup-time-mean;
 *                 }
 *                 leaf rabps-setup-time-max {
 *                     type rabps-setup-time-max;
 *                 }
 *                 leaf fail-ho {
 *                     type uint64;
 *                 }
 *                 leaf succ-ho {
 *                     type uint64;
 *                 }
 *                 uses umts-rab-g;
 *             }
 *             uses umts-g;
 *         }
 *         container lte {
 *             leaf tunnel-number-of-entries {
 *                 type uint64;
 *             }
 *             list lte-tunnel {
 *                 key "tunnel-ref";
 *                 leaf enable {
 *                     type boolean;
 *                 }
 *                 leaf alias {
 *                     type string;
 *                 }
 *                 leaf tunnel-ref {
 *                     type string;
 *                 }
 *                 leaf-list plmnid {
 *                     type string;
 *                 }
 *                 uses lte-tunnel-g;
 *             }
 *             container lte-epc {
 *                 leaf-list allowed-ciphering-algorithm-list {
 *                     type enumeration;
 *                 }
 *                 leaf-list allowed-integrity-protection-algorithm-list {
 *                     type enumeration;
 *                 }
 *                 leaf tac {
 *                     type uint16;
 *                 }
 *                 leaf eaid {
 *                     type uint32;
 *                 }
 *                 leaf max-plmn-list-entries {
 *                     type uint64;
 *                 }
 *                 leaf plmn-list-number-of-entries {
 *                     type uint64;
 *                 }
 *                 leaf max-qo-s-entries {
 *                     type uint64;
 *                 }
 *                 leaf qo-s-number-of-entries {
 *                     type uint64;
 *                 }
 *                 list lte-epc-plmn-list {
 *                     key "plmnid";
 *                     leaf enable {
 *                         type boolean;
 *                     }
 *                     leaf alias {
 *                         type string;
 *                     }
 *                     leaf is-primary {
 *                         type boolean;
 *                     }
 *                     leaf plmnid {
 *                         type string;
 *                     }
 *                     leaf cell-reserved-for-operator-use {
 *                         type boolean;
 *                     }
 *                     uses lte-epc-plmn-list-g;
 *                 }
 *                 list lte-epc-qo-s {
 *                     key "qci";
 *                     leaf enable {
 *                         type boolean;
 *                     }
 *                     leaf alias {
 *                         type string;
 *                     }
 *                     leaf qci {
 *                         type uint8;
 *                     }
 *                     leaf type {
 *                         type enumeration;
 *                     }
 *                     leaf priority {
 *                         type uint8;
 *                     }
 *                     leaf packet-delay-budget {
 *                         type packet-delay-budget;
 *                     }
 *                     uses lte-epc-qo-s-g;
 *                 }
 *                 uses lte-epc-g;
 *             }
 *             container lte-ran {
 *                 container lte-ran-common {
 *                     leaf cell-identity {
 *                         type uint32;
 *                     }
 *                     uses lte-ran-common-g;
 *                 }
 *                 container lte-ran-s1-ap {
 *                     leaf-list t-reloc-prep {
 *                         type string;
 *                     }
 *                     leaf-list t-reloc-overall {
 *                         type string;
 *                     }
 *                     uses lte-ran-s1-ap-g;
 *                 }
 *                 container lte-ran-s1-u {
 *                     leaf gtpu-echo-interval {
 *                         type gtpu-echo-interval;
 *                     }
 *                     uses lte-ran-s1-u-g;
 *                 }
 *                 container lte-ran-rf {
 *                     leaf-list earfcndl {
 *                         type uint16;
 *                     }
 *                     leaf-list earfcnul {
 *                         type uint16;
 *                     }
 *                     leaf freq-band-indicator {
 *                         type uint8;
 *                     }
 *                     leaf-list dl-bandwidth {
 *                         type uint8;
 *                     }
 *                     leaf-list ul-bandwidth {
 *                         type uint8;
 *                     }
 *                     leaf-list reference-signal-power {
 *                         type string;
 *                     }
 *                     leaf-list phy-cell-id {
 *                         type string;
 *                     }
 *                     leaf-list psch-power-offset {
 *                         type string;
 *                     }
 *                     leaf-list ssch-power-offset {
 *                         type string;
 *                     }
 *                     leaf-list pbch-power-offset {
 *                         type string;
 *                     }
 *                     uses lte-ran-rf-g;
 *                 }
 *                 container lte-ran-phy {
 *                     container lte-ran-phy-antenna-info {
 *                         leaf antenna-ports-count {
 *                             type uint8;
 *                         }
 *                         uses lte-ran-phy-antenna-info-g;
 *                     }
 *                     container lte-ran-phy-pdsch {
 *                         leaf-list pb {
 *                             type string;
 *                         }
 *                         leaf-list pa {
 *                             type int64;
 *                         }
 *                         uses lte-ran-phy-pdsch-g;
 *                     }
 *                     container lte-ran-phy-srs {
 *                         leaf srs-enabled {
 *                             type boolean;
 *                         }
 *                         leaf-list srs-bandwidth-config {
 *                             type string;
 *                         }
 *                         leaf srs-max-up-pts {
 *                             type boolean;
 *                         }
 *                         leaf ack-nack-srs-simultaneous-transmission {
 *                             type boolean;
 *                         }
 *                         uses lte-ran-phy-srs-g;
 *                     }
 *                     container lte-ran-phy-prach {
 *                         leaf-list root-sequence-index {
 *                             type string;
 *                         }
 *                         leaf-list configuration-index {
 *                             type string;
 *                         }
 *                         leaf high-speed-flag {
 *                             type boolean;
 *                         }
 *                         leaf-list zero-correlation-zone-config {
 *                             type string;
 *                         }
 *                         leaf-list freq-offset {
 *                             type string;
 *                         }
 *                         uses lte-ran-phy-prach-g;
 *                     }
 *                     container lte-ran-phy-pucch {
 *                         leaf delta-pucch-shift {
 *                             type enumeration;
 *                         }
 *                         leaf-list nrbcqi {
 *                             type string;
 *                         }
 *                         leaf ncsan {
 *                             type uint8;
 *                         }
 *                         leaf-list n1-pucchan {
 *                             type string;
 *                         }
 *                         leaf-list cqipucch-resource-index {
 *                             type string;
 *                         }
 *                         leaf k {
 *                             type k;
 *                         }
 *                         uses lte-ran-phy-pucch-g;
 *                     }
 *                     container lte-ran-phy-pusch {
 *                         leaf nsb {
 *                             type uint8;
 *                         }
 *                         leaf hopping-mode {
 *                             type enumeration;
 *                         }
 *                         leaf-list hopping-offset {
 *                             type string;
 *                         }
 *                         leaf enable64-qam {
 *                             type boolean;
 *                         }
 *                         container lte-ran-phy-pusch-ulrs {
 *                             leaf group-hopping-enabled {
 *                                 type boolean;
 *                             }
 *                             leaf group-assignment-pusch {
 *                                 type uint8;
 *                             }
 *                             leaf sequence-hopping-enabled {
 *                                 type boolean;
 *                             }
 *                             leaf cyclic-shift {
 *                                 type uint8;
 *                             }
 *                             uses lte-ran-phy-pusch-ulrs-g;
 *                         }
 *                         uses lte-ran-phy-pusch-g;
 *                     }
 *                     container lte-ran-phy-ul-power-control {
 *                         leaf-list p0-nominal-pusch {
 *                             type string;
 *                         }
 *                         leaf-list alpha {
 *                             type string;
 *                         }
 *                         leaf-list p0-nominal-pucch {
 *                             type string;
 *                         }
 *                         leaf delta-fpucch-format1 {
 *                             type delta-fpucch-format1;
 *                         }
 *                         leaf delta-fpucch-format1b {
 *                             type delta-fpucch-format1b;
 *                         }
 *                         leaf delta-fpucch-format2 {
 *                             type delta-fpucch-format2;
 *                         }
 *                         leaf delta-fpucch-format2a {
 *                             type delta-fpucch-format2a;
 *                         }
 *                         leaf delta-fpucch-format2b {
 *                             type delta-fpucch-format2b;
 *                         }
 *                         leaf delta-preamble-msg3 {
 *                             type delta-preamble-msg3;
 *                         }
 *                         uses lte-ran-phy-ul-power-control-g;
 *                     }
 *                     container lte-ran-phy-mbsfn {
 *                         leaf neigh-cell-config {
 *                             type uint8;
 *                         }
 *                         leaf max-sf-config-list-entries {
 *                             type uint64;
 *                         }
 *                         leaf sf-config-list-number-of-entries {
 *                             type uint64;
 *                         }
 *                         list lte-ran-phy-mbsfn-sf-config-list {
 *                             key "radio-frame-allocation-period" "radioframe-allocation-offset" "radio-frame-allocation-size";
 *                             leaf enable {
 *                                 type boolean;
 *                             }
 *                             leaf alias {
 *                                 type string;
 *                             }
 *                             leaf sync-stratum-id {
 *                                 type uint8;
 *                             }
 *                             leaf radio-frame-allocation-period {
 *                                 type uint8;
 *                             }
 *                             leaf radioframe-allocation-offset {
 *                                 type uint8;
 *                             }
 *                             leaf radio-frame-allocation-size {
 *                                 type uint8;
 *                             }
 *                             leaf-list sub-frame-allocations {
 *                                 type uint8;
 *                             }
 *                             uses lte-ran-phy-mbsfn-sf-config-list-g;
 *                         }
 *                         uses lte-ran-phy-mbsfn-g;
 *                     }
 *                     container lte-ran-phy-prs {
 *                         leaf num-prs-resource-blocks {
 *                             type num-prs-resource-blocks;
 *                         }
 *                         leaf prs-configuration-index {
 *                             type uint16;
 *                         }
 *                         leaf num-consecutive-prs-subfames {
 *                             type uint8;
 *                         }
 *                         uses lte-ran-phy-prs-g;
 *                     }
 *                     container lte-ran-phy-tdd-frame {
 *                         leaf sub-frame-assignment {
 *                             type uint8;
 *                         }
 *                         leaf special-subframe-patterns {
 *                             type uint8;
 *                         }
 *                         uses lte-ran-phy-tdd-frame-g;
 *                     }
 *                     uses lte-ran-phy-g;
 *                 }
 *                 container lte-ran-mac {
 *                     container lte-ran-mac-rach {
 *                         leaf-list number-of-ra-preambles {
 *                             type uint8;
 *                         }
 *                         leaf-list size-of-ra-group-a {
 *                             type uint8;
 *                         }
 *                         leaf-list message-size-group-a {
 *                             type uint16;
 *                         }
 *                         leaf-list message-power-offset-group-b {
 *                             type int64;
 *                         }
 *                         leaf-list power-ramping-step {
 *                             type uint8;
 *                         }
 *                         leaf-list preamble-initial-received-target-power {
 *                             type int64;
 *                         }
 *                         leaf-list preamble-trans-max {
 *                             type string;
 *                         }
 *                         leaf-list response-window-size {
 *                             type string;
 *                         }
 *                         leaf-list contention-resolution-timer {
 *                             type uint8;
 *                         }
 *                         leaf-list max-harq-msg3-tx {
 *                             type string;
 *                         }
 *                         uses lte-ran-mac-rach-g;
 *                     }
 *                     container lte-ran-mac-drx {
 *                         leaf drx-enabled {
 *                             type boolean;
 *                         }
 *                         leaf-list on-duration-timer {
 *                             type string;
 *                         }
 *                         leaf-list drx-inactivity-timer {
 *                             type string;
 *                         }
 *                         leaf-list drx-retransmission-timer {
 *                             type uint8;
 *                         }
 *                         leaf-list long-drx-cycle {
 *                             type uint16;
 *                         }
 *                         leaf-list drx-start-offset {
 *                             type string;
 *                         }
 *                         leaf-list short-drx-cycle {
 *                             type uint16;
 *                         }
 *                         leaf-list drx-short-cycle-timer {
 *                             type string;
 *                         }
 *                         uses lte-ran-mac-drx-g;
 *                     }
 *                     container lte-ran-mac-ulsch {
 *                         leaf max-harq-tx {
 *                             type uint8;
 *                         }
 *                         leaf periodic-bsr-timer {
 *                             type periodic-bsr-timer;
 *                         }
 *                         leaf retx-bsr-timer {
 *                             type retx-bsr-timer;
 *                         }
 *                         leaf tti-bundling {
 *                             type boolean;
 *                         }
 *                         uses lte-ran-mac-ulsch-g;
 *                     }
 *                     uses lte-ran-mac-g;
 *                 }
 *                 container lte-ran-rlc {
 *                     container lte-ran-rlc-srb1 {
 *                         leaf default-configuration {
 *                             type boolean;
 *                         }
 *                         leaf-list t-poll-retransmit {
 *                             type string;
 *                         }
 *                         leaf-list poll-pdu {
 *                             type uint16;
 *                         }
 *                         leaf-list poll-byte {
 *                             type uint16;
 *                         }
 *                         leaf-list max-retx-threshold {
 *                             type uint8;
 *                         }
 *                         leaf-list t-reordering {
 *                             type string;
 *                         }
 *                         leaf-list t-status-prohibit {
 *                             type string;
 *                         }
 *                         uses lte-ran-rlc-srb1-g;
 *                     }
 *                     container lte-ran-rlc-srb2 {
 *                         leaf default-configuration {
 *                             type boolean;
 *                         }
 *                         leaf-list t-poll-retransmit {
 *                             type string;
 *                         }
 *                         leaf-list poll-pdu {
 *                             type uint16;
 *                         }
 *                         leaf-list poll-byte {
 *                             type uint16;
 *                         }
 *                         leaf-list max-retx-threshold {
 *                             type uint8;
 *                         }
 *                         leaf-list t-reordering {
 *                             type string;
 *                         }
 *                         leaf-list t-status-prohibit {
 *                             type string;
 *                         }
 *                         uses lte-ran-rlc-srb2-g;
 *                     }
 *                     uses lte-ran-rlc-g;
 *                 }
 *                 container lte-ran-rrc-timers {
 *                     leaf-list t300 {
 *                         type uint16;
 *                     }
 *                     leaf-list t301 {
 *                         type uint16;
 *                     }
 *                     leaf t302 {
 *                         type t302;
 *                     }
 *                     leaf-list t304-eutra {
 *                         type uint16;
 *                     }
 *                     leaf-list t304-irat {
 *                         type uint16;
 *                     }
 *                     leaf-list t310 {
 *                         type uint16;
 *                     }
 *                     leaf-list t311 {
 *                         type uint16;
 *                     }
 *                     leaf t320 {
 *                         type t320;
 *                     }
 *                     leaf n310 {
 *                         type uint8;
 *                     }
 *                     leaf n311 {
 *                         type uint8;
 *                     }
 *                     uses lte-ran-rrc-timers-g;
 *                 }
 *                 container lte-ran-cell-restriction {
 *                     leaf cell-barred {
 *                         type boolean;
 *                     }
 *                     leaf cell-reserved-for-operator-use {
 *                         type boolean;
 *                     }
 *                     leaf barring-for-emergency {
 *                         type boolean;
 *                     }
 *                     uses lte-ran-cell-restriction-g;
 *                 }
 *                 container lte-ran-mobility {
 *                     container lte-ran-mobility-idle-mode {
 *                         container lte-ran-mobility-idle-mode-common {
 *                             leaf-list qhyst {
 *                                 type string;
 *                             }
 *                             leaf q-hyst-sf-medium {
 *                                 type q-hyst-sf-medium;
 *                             }
 *                             leaf q-hyst-sf-high {
 *                                 type q-hyst-sf-high;
 *                             }
 *                             leaf t-evaluation {
 *                                 type t-evaluation;
 *                             }
 *                             leaf t-hyst-normal {
 *                                 type t-hyst-normal;
 *                             }
 *                             leaf n-cell-change-medium {
 *                                 type uint8;
 *                             }
 *                             leaf n-cell-change-high {
 *                                 type uint8;
 *                             }
 *                             uses lte-ran-mobility-idle-mode-common-g;
 *                         }
 *                         container lte-ran-mobility-idle-mode-intra-freq {
 *                             leaf-list q-rx-lev-min-sib1 {
 *                                 type string;
 *                             }
 *                             leaf-list q-rx-lev-min-sib3 {
 *                                 type string;
 *                             }
 *                             leaf q-rx-lev-min-offset {
 *                                 type q-rx-lev-min-offset;
 *                             }
 *                             leaf-list s-intra-search {
 *                                 type string;
 *                             }
 *                             leaf-list t-reselection-eutra {
 *                                 type string;
 *                             }
 *                             leaf-list s-non-intra-search {
 *                                 type string;
 *                             }
 *                             leaf cell-reselection-priority {
 *                                 type uint8;
 *                             }
 *                             leaf p-max {
 *                                 type p-max;
 *                             }
 *                             leaf thresh-serving-low {
 *                                 type thresh-serving-low;
 *                             }
 *                             leaf t-reselection-eutrasf-medium {
 *                                 type uint8;
 *                             }
 *                             leaf t-reselection-eutrasf-high {
 *                                 type uint8;
 *                             }
 *                             uses lte-ran-mobility-idle-mode-intra-freq-g;
 *                         }
 *                         container lte-ran-mobility-idle-mode-inter-freq {
 *                             leaf max-carrier-entries {
 *                                 type uint64;
 *                             }
 *                             leaf carrier-number-of-entries {
 *                                 type uint64;
 *                             }
 *                             list lte-ran-mobility-idle-mode-inter-freq-carrier {
 *                                 key "eutra-carrier-arfcn";
 *                                 leaf enable {
 *                                     type boolean;
 *                                 }
 *                                 leaf alias {
 *                                     type string;
 *                                 }
 *                                 leaf eutra-carrier-arfcn {
 *                                     type uint16;
 *                                 }
 *                                 leaf-list q-rx-lev-min-sib5 {
 *                                     type string;
 *                                 }
 *                                 leaf-list q-offset-freq {
 *                                     type string;
 *                                 }
 *                                 leaf-list t-reselection-eutra {
 *                                     type string;
 *                                 }
 *                                 leaf cell-reselection-priority {
 *                                     type uint8;
 *                                 }
 *                                 leaf thresh-x-high {
 *                                     type thresh-x-high;
 *                                 }
 *                                 leaf thresh-x-low {
 *                                     type thresh-x-low;
 *                                 }
 *                                 leaf p-max {
 *                                     type p-max;
 *                                 }
 *                                 leaf t-reselection-eutrasf-medium {
 *                                     type uint8;
 *                                 }
 *                                 leaf t-reselection-eutrasf-high {
 *                                     type uint8;
 *                                 }
 *                                 uses lte-ran-mobility-idle-mode-inter-freq-carrier-g;
 *                             }
 *                             uses lte-ran-mobility-idle-mode-inter-freq-g;
 *                         }
 *                         container lte-ran-mobility-idle-mode-irat {
 *                             container lte-ran-mobility-idle-mode-irat-utra {
 *                                 leaf-list t-reselection-utra {
 *                                     type string;
 *                                 }
 *                                 leaf t-reselection-utrasf-medium {
 *                                     type uint8;
 *                                 }
 *                                 leaf t-reselection-utrasf-high {
 *                                     type uint8;
 *                                 }
 *                                 leaf max-utranfdd-freq-entries {
 *                                     type uint64;
 *                                 }
 *                                 leaf utranfdd-freq-number-of-entries {
 *                                     type uint64;
 *                                 }
 *                                 list lte-ran-mobility-idle-mode-irat-utra-utranfdd-freq {
 *                                     key "utra-carrier-arfcn";
 *                                     leaf enable {
 *                                         type boolean;
 *                                     }
 *                                     leaf alias {
 *                                         type string;
 *                                     }
 *                                     leaf utra-carrier-arfcn {
 *                                         type uint16;
 *                                     }
 *                                     leaf-list q-rx-lev-min {
 *                                         type string;
 *                                     }
 *                                     leaf-list q-qual-min {
 *                                         type string;
 *                                     }
 *                                     leaf cell-reselection-priority {
 *                                         type uint8;
 *                                     }
 *                                     leaf thresh-x-high {
 *                                         type thresh-x-high;
 *                                     }
 *                                     leaf thresh-x-low {
 *                                         type thresh-x-low;
 *                                     }
 *                                     leaf p-max-utra {
 *                                         type p-max-utra;
 *                                     }
 *                                     uses lte-ran-mobility-idle-mode-irat-utra-utranfdd-freq-g;
 *                                 }
 *                                 uses lte-ran-mobility-idle-mode-irat-utra-g;
 *                             }
 *                             container lte-ran-mobility-idle-mode-irat-geran {
 *                                 leaf-list t-reselection-geran {
 *                                     type string;
 *                                 }
 *                                 leaf t-reselection-geransf-medium {
 *                                     type uint8;
 *                                 }
 *                                 leaf t-reselection-geransf-high {
 *                                     type uint8;
 *                                 }
 *                                 leaf max-geran-freq-group-entries {
 *                                     type uint64;
 *                                 }
 *                                 leaf geran-freq-group-number-of-entries {
 *                                     type uint64;
 *                                 }
 *                                 list lte-ran-mobility-idle-mode-irat-geran-geran-freq-group {
 *                                     key "bccharfcn";
 *                                     leaf enable {
 *                                         type boolean;
 *                                     }
 *                                     leaf alias {
 *                                         type string;
 *                                     }
 *                                     leaf band-indicator {
 *                                         type enumeration;
 *                                     }
 *                                     leaf bccharfcn {
 *                                         type uint16;
 *                                     }
 *                                     leaf-list q-rx-lev-min {
 *                                         type string;
 *                                     }
 *                                     leaf cell-reselection-priority {
 *                                         type uint8;
 *                                     }
 *                                     leaf thresh-x-high {
 *                                         type thresh-x-high;
 *                                     }
 *                                     leaf thresh-x-low {
 *                                         type thresh-x-low;
 *                                     }
 *                                     uses lte-ran-mobility-idle-mode-irat-geran-geran-freq-group-g;
 *                                 }
 *                                 uses lte-ran-mobility-idle-mode-irat-geran-g;
 *                             }
 *                             container lte-ran-mobility-idle-mode-irat-cdma2000 {
 *                                 leaf-list search-window-size {
 *                                     type string;
 *                                 }
 *                                 leaf-list t-reselection-cdma2000 {
 *                                     type string;
 *                                 }
 *                                 leaf t-reselection-cdma2000-sf-medium {
 *                                     type uint8;
 *                                 }
 *                                 leaf t-reselection-cdma2000-sf-high {
 *                                     type uint8;
 *                                 }
 *                                 leaf max-cdma2000-band-entries {
 *                                     type uint64;
 *                                 }
 *                                 leaf cdma2000-band-number-of-entries {
 *                                     type uint64;
 *                                 }
 *                                 list lte-ran-mobility-idle-mode-irat-cdma2000-cdma2000-band {
 *                                     key "band-class";
 *                                     leaf enable {
 *                                         type boolean;
 *                                     }
 *                                     leaf alias {
 *                                         type string;
 *                                     }
 *                                     leaf band-class {
 *                                         type band-class;
 *                                     }
 *                                     leaf cell-reselection-priority {
 *                                         type uint8;
 *                                     }
 *                                     leaf thresh-x-high {
 *                                         type thresh-x-high;
 *                                     }
 *                                     leaf thresh-x-low {
 *                                         type thresh-x-low;
 *                                     }
 *                                     uses lte-ran-mobility-idle-mode-irat-cdma2000-cdma2000-band-g;
 *                                 }
 *                                 uses lte-ran-mobility-idle-mode-irat-cdma2000-g;
 *                             }
 *                             uses lte-ran-mobility-idle-mode-irat-g;
 *                         }
 *                         uses lte-ran-mobility-idle-mode-g;
 *                     }
 *                     container lte-ran-mobility-conn-mode {
 *                         container lte-ran-mobility-conn-mode-eutra {
 *                             leaf-list filter-coefficient-rsrp {
 *                                 type string;
 *                             }
 *                             leaf-list filter-coefficient-rsrq {
 *                                 type string;
 *                             }
 *                             leaf a1-threshold-rsrp {
 *                                 type uint8;
 *                             }
 *                             leaf a1-threshold-rsrq {
 *                                 type uint8;
 *                             }
 *                             leaf a2-threshold-rsrp {
 *                                 type uint8;
 *                             }
 *                             leaf a2-threshold-rsrq {
 *                                 type uint8;
 *                             }
 *                             leaf-list a3-offset {
 *                                 type string;
 *                             }
 *                             leaf report-on-leave {
 *                                 type boolean;
 *                             }
 *                             leaf a4-threshold-rsrp {
 *                                 type uint8;
 *                             }
 *                             leaf a4-threshold-rsrq {
 *                                 type uint8;
 *                             }
 *                             leaf a5-threshold1-rsrp {
 *                                 type uint8;
 *                             }
 *                             leaf a5-threshold1-rsrq {
 *                                 type uint8;
 *                             }
 *                             leaf a5-threshold2-rsrp {
 *                                 type uint8;
 *                             }
 *                             leaf a5-threshold2-rsrq {
 *                                 type uint8;
 *                             }
 *                             leaf-list hysteresis {
 *                                 type string;
 *                             }
 *                             leaf-list time-to-trigger {
 *                                 type uint16;
 *                             }
 *                             leaf trigger-quantity {
 *                                 type enumeration;
 *                             }
 *                             leaf report-quantity {
 *                                 type enumeration;
 *                             }
 *                             leaf max-report-cells {
 *                                 type uint8;
 *                             }
 *                             leaf report-interval {
 *                                 type report-interval;
 *                             }
 *                             leaf report-amount {
 *                                 type uint8;
 *                             }
 *                             uses lte-ran-mobility-conn-mode-eutra-g;
 *                         }
 *                         container lte-ran-mobility-conn-mode-irat {
 *                             leaf-list qoffsett-utra {
 *                                 type string;
 *                             }
 *                             leaf-list filter-coefficient-utra {
 *                                 type string;
 *                             }
 *                             leaf meas-quantity-utrafdd {
 *                                 type enumeration;
 *                             }
 *                             leaf b1-threshold-utrarscp {
 *                                 type b1-threshold-utrarscp;
 *                             }
 *                             leaf b1-threshold-utra-ec-n0 {
 *                                 type b1-threshold-utra-ec-n0;
 *                             }
 *                             leaf-list qoffset-geran {
 *                                 type string;
 *                             }
 *                             leaf-list filter-coefficient-geran {
 *                                 type string;
 *                             }
 *                             leaf b1-threshold-geran {
 *                                 type b1-threshold-geran;
 *                             }
 *                             leaf-list qoffset-cdma2000 {
 *                                 type string;
 *                             }
 *                             leaf meas-quantity-cdma2000 {
 *                                 type enumeration;
 *                             }
 *                             leaf b1-threshold-cdma2000 {
 *                                 type b1-threshold-cdma2000;
 *                             }
 *                             leaf b2-threshold2-utrarscp {
 *                                 type b2-threshold2-utrarscp;
 *                             }
 *                             leaf b2-threshold2-utra-ec-n0 {
 *                                 type b2-threshold2-utra-ec-n0;
 *                             }
 *                             leaf b2-threshold2-geran {
 *                                 type b2-threshold2-geran;
 *                             }
 *                             leaf b2-threshold2-cdma2000 {
 *                                 type b2-threshold2-cdma2000;
 *                             }
 *                             leaf-list hysteresis {
 *                                 type string;
 *                             }
 *                             leaf-list time-to-trigger {
 *                                 type uint16;
 *                             }
 *                             leaf max-report-cells {
 *                                 type uint8;
 *                             }
 *                             leaf report-interval {
 *                                 type report-interval;
 *                             }
 *                             leaf report-amount {
 *                                 type uint8;
 *                             }
 *                             uses lte-ran-mobility-conn-mode-irat-g;
 *                         }
 *                         uses lte-ran-mobility-conn-mode-g;
 *                     }
 *                     uses lte-ran-mobility-g;
 *                 }
 *                 container lte-ran-neighbor-list {
 *                     leaf max-lte-cell-entries {
 *                         type uint64;
 *                     }
 *                     leaf lte-cell-number-of-entries {
 *                         type uint64;
 *                     }
 *                     list lte-ran-neighbor-list-lte-cell {
 *                         key "plmnid" "cid";
 *                         leaf enable {
 *                             type boolean;
 *                         }
 *                         leaf alias {
 *                             type string;
 *                         }
 *                         leaf must-include {
 *                             type boolean;
 *                         }
 *                         leaf plmnid {
 *                             type string;
 *                         }
 *                         leaf cid {
 *                             type uint32;
 *                         }
 *                         leaf eutra-carrier-arfcn {
 *                             type uint16;
 *                         }
 *                         leaf phy-cell-id {
 *                             type uint16;
 *                         }
 *                         leaf q-offset {
 *                             type int64;
 *                         }
 *                         leaf cio {
 *                             type int64;
 *                         }
 *                         leaf rs-tx-power {
 *                             type rs-tx-power;
 *                         }
 *                         leaf blacklisted {
 *                             type boolean;
 *                         }
 *                         uses lte-ran-neighbor-list-lte-cell-g;
 *                     }
 *                     container lte-ran-neighbor-list-inter-rat-cell {
 *                         leaf max-umts-entries {
 *                             type uint64;
 *                         }
 *                         leaf max-gsm-entries {
 *                             type uint64;
 *                         }
 *                         leaf max-cdma2000-entries {
 *                             type uint64;
 *                         }
 *                         leaf umts-number-of-entries {
 *                             type uint64;
 *                         }
 *                         leaf gsm-number-of-entries {
 *                             type uint64;
 *                         }
 *                         leaf cdma2000-number-of-entries {
 *                             type uint64;
 *                         }
 *                         list lte-ran-neighbor-list-inter-rat-cell-umts {
 *                             key "plmnid" "cid";
 *                             leaf enable {
 *                                 type boolean;
 *                             }
 *                             leaf alias {
 *                                 type string;
 *                             }
 *                             leaf must-include {
 *                                 type boolean;
 *                             }
 *                             leaf plmnid {
 *                                 type string;
 *                             }
 *                             leaf rncid {
 *                                 type uint16;
 *                             }
 *                             leaf cid {
 *                                 type uint16;
 *                             }
 *                             leaf lac {
 *                                 type uint16;
 *                             }
 *                             leaf rac {
 *                                 type uint8;
 *                             }
 *                             leaf ura {
 *                                 type uint16;
 *                             }
 *                             leaf uarfcnul {
 *                                 type uint16;
 *                             }
 *                             leaf uarfcndl {
 *                                 type uint16;
 *                             }
 *                             leaf pcpich-scrambling-code {
 *                                 type uint16;
 *                             }
 *                             leaf pcpich-tx-power {
 *                                 type pcpich-tx-power;
 *                             }
 *                             uses lte-ran-neighbor-list-inter-rat-cell-umts-g;
 *                         }
 *                         list lte-ran-neighbor-list-inter-rat-cell-gsm {
 *                             key "plmnid" "lac" "ci";
 *                             leaf enable {
 *                                 type boolean;
 *                             }
 *                             leaf alias {
 *                                 type string;
 *                             }
 *                             leaf must-include {
 *                                 type boolean;
 *                             }
 *                             leaf plmnid {
 *                                 type string;
 *                             }
 *                             leaf lac {
 *                                 type uint16;
 *                             }
 *                             leaf bsic {
 *                                 type uint8;
 *                             }
 *                             leaf ci {
 *                                 type uint16;
 *                             }
 *                             leaf band-indicator {
 *                                 type enumeration;
 *                             }
 *                             leaf bccharfcn {
 *                                 type uint16;
 *                             }
 *                             uses lte-ran-neighbor-list-inter-rat-cell-gsm-g;
 *                         }
 *                         list lte-ran-neighbor-list-inter-rat-cell-cdma2000 {
 *                             key "cid";
 *                             leaf enable {
 *                                 type boolean;
 *                             }
 *                             leaf alias {
 *                                 type string;
 *                             }
 *                             leaf must-include {
 *                                 type boolean;
 *                             }
 *                             leaf band-class {
 *                                 type uint8;
 *                             }
 *                             leaf arfcn {
 *                                 type uint16;
 *                             }
 *                             leaf pn-offset {
 *                                 type uint16;
 *                             }
 *                             leaf type {
 *                                 type enumeration;
 *                             }
 *                             leaf cid {
 *                                 type string;
 *                             }
 *                             uses lte-ran-neighbor-list-inter-rat-cell-cdma2000-g;
 *                         }
 *                         uses lte-ran-neighbor-list-inter-rat-cell-g;
 *                     }
 *                     uses lte-ran-neighbor-list-g;
 *                 }
 *                 container lte-ran-neighbor-list-in-use {
 *                     leaf max-lte-cell-entries {
 *                         type uint64;
 *                     }
 *                     leaf lte-cell-number-of-entries {
 *                         type uint64;
 *                     }
 *                     list lte-ran-neighbor-list-in-use-lte-cell {
 *                         key "plmnid" "cid";
 *                         leaf plmnid {
 *                             type string;
 *                         }
 *                         leaf cid {
 *                             type uint32;
 *                         }
 *                         leaf eutra-carrier-arfcn {
 *                             type uint16;
 *                         }
 *                         leaf phy-cell-id {
 *                             type uint16;
 *                         }
 *                         leaf q-offset {
 *                             type int64;
 *                         }
 *                         leaf cio {
 *                             type int64;
 *                         }
 *                         leaf rs-tx-power {
 *                             type rs-tx-power;
 *                         }
 *                         leaf blacklisted {
 *                             type boolean;
 *                         }
 *                         uses lte-ran-neighbor-list-in-use-lte-cell-g;
 *                     }
 *                     container lte-ran-neighbor-list-in-use-inter-rat-cell {
 *                         leaf max-umts-entries {
 *                             type uint64;
 *                         }
 *                         leaf max-gsm-entries {
 *                             type uint64;
 *                         }
 *                         leaf max-cdma2000-entries {
 *                             type uint64;
 *                         }
 *                         leaf umts-number-of-entries {
 *                             type uint64;
 *                         }
 *                         leaf gsm-number-of-entries {
 *                             type uint64;
 *                         }
 *                         leaf cdma2000-number-of-entries {
 *                             type uint64;
 *                         }
 *                         list lte-ran-neighbor-list-in-use-inter-rat-cell-umts {
 *                             key "plmnid" "cid";
 *                             leaf plmnid {
 *                                 type string;
 *                             }
 *                             leaf rncid {
 *                                 type uint16;
 *                             }
 *                             leaf cid {
 *                                 type uint16;
 *                             }
 *                             leaf lac {
 *                                 type uint16;
 *                             }
 *                             leaf rac {
 *                                 type uint8;
 *                             }
 *                             leaf ura {
 *                                 type uint16;
 *                             }
 *                             leaf uarfcnul {
 *                                 type uint16;
 *                             }
 *                             leaf uarfcndl {
 *                                 type uint16;
 *                             }
 *                             leaf pcpich-scrambling-code {
 *                                 type uint16;
 *                             }
 *                             leaf pcpich-tx-power {
 *                                 type pcpich-tx-power;
 *                             }
 *                             uses lte-ran-neighbor-list-in-use-inter-rat-cell-umts-g;
 *                         }
 *                         list lte-ran-neighbor-list-in-use-inter-rat-cell-gsm {
 *                             key "plmnid" "lac" "ci";
 *                             leaf plmnid {
 *                                 type string;
 *                             }
 *                             leaf lac {
 *                                 type uint16;
 *                             }
 *                             leaf bsic {
 *                                 type uint8;
 *                             }
 *                             leaf ci {
 *                                 type uint16;
 *                             }
 *                             leaf band-indicator {
 *                                 type enumeration;
 *                             }
 *                             leaf bccharfcn {
 *                                 type uint16;
 *                             }
 *                             uses lte-ran-neighbor-list-in-use-inter-rat-cell-gsm-g;
 *                         }
 *                         list lte-ran-neighbor-list-in-use-inter-rat-cell-cdma2000 {
 *                             key "cid";
 *                             leaf band-class {
 *                                 type uint8;
 *                             }
 *                             leaf arfcn {
 *                                 type uint16;
 *                             }
 *                             leaf pn-offset {
 *                                 type uint16;
 *                             }
 *                             leaf type {
 *                                 type enumeration;
 *                             }
 *                             leaf cid {
 *                                 type string;
 *                             }
 *                             uses lte-ran-neighbor-list-in-use-inter-rat-cell-cdma2000-g;
 *                         }
 *                         uses lte-ran-neighbor-list-in-use-inter-rat-cell-g;
 *                     }
 *                     uses lte-ran-neighbor-list-in-use-g;
 *                 }
 *                 uses lte-ran-g;
 *             }
 *             uses lte-g;
 *         }
 *         container cdma2000 {
 *             leaf tunnel-instance {
 *                 type string;
 *             }
 *             container cdma2000-one-x {
 *                 leaf pcfpdsn-number-of-entries {
 *                     type uint64;
 *                 }
 *                 leaf max-batch-pcfpdsn-entries {
 *                     type uint64;
 *                 }
 *                 leaf batch-pcfpdsn-number-of-entries {
 *                     type uint64;
 *                 }
 *                 container cdma2000-one-x-ran {
 *                     leaf one-x-sector-nid {
 *                         type int64;
 *                     }
 *                     leaf one-x-sector-sid {
 *                         type int64;
 *                     }
 *                     leaf one-xpzid {
 *                         type int64;
 *                     }
 *                     leaf base-id {
 *                         type int64;
 *                     }
 *                     leaf max-neighbor-list-entries {
 *                         type uint64;
 *                     }
 *                     leaf neighbor-list-number-of-entries {
 *                         type uint64;
 *                     }
 *                     container cdma2000-one-x-ran-rf {
 *                         leaf-list rfcnfl {
 *                             type string;
 *                         }
 *                         leaf rfcnfl-band-in-use {
 *                             type string;
 *                         }
 *                         leaf rfcnfl-in-use {
 *                             type uint64;
 *                         }
 *                         leaf-list pilot-pn {
 *                             type string;
 *                         }
 *                         leaf pilot-pn-in-use {
 *                             type pilot-pn-in-use;
 *                         }
 *                         leaf maxfap-tx-power {
 *                             type string;
 *                         }
 *                         leaf maxfap-tx-power-in-use {
 *                             type maxfap-tx-power-in-use;
 *                         }
 *                         leaf pch-pwr-percentage {
 *                             type pch-pwr-percentage;
 *                         }
 *                         leaf pilot-pwr-percentage {
 *                             type pilot-pwr-percentage;
 *                         }
 *                         leaf sync-pwr-percentage {
 *                             type sync-pwr-percentage;
 *                         }
 *                         uses cdma2000-one-x-ran-rf-g;
 *                     }
 *                     container cdma2000-one-x-ran-network-listen-mode-config {
 *                         leaf rfcnfl-margin {
 *                             type uint64;
 *                         }
 *                         leaf fap-coverage-target {
 *                             type string;
 *                         }
 *                         leaf fap-beacon-coverage-target {
 *                             type string;
 *                         }
 *                         leaf max-coverage-edge-pilot-strength {
 *                             type max-coverage-edge-pilot-strength;
 *                         }
 *                         leaf max-allowable-pilot-strength-degradation {
 *                             type max-allowable-pilot-strength-degradation;
 *                         }
 *                         leaf-list rfcnfl-to-protect {
 *                             type string;
 *                         }
 *                         leaf fap-allowed-adj-chan-coverage-hole {
 *                             type fap-allowed-adj-chan-coverage-hole;
 *                         }
 *                         leaf acir {
 *                             type acir;
 *                         }
 *                         uses cdma2000-one-x-ran-network-listen-mode-config-g;
 *                     }
 *                     container cdma2000-one-x-ran-access-parameters {
 *                         leaf nom-pwr {
 *                             type int64;
 *                         }
 *                         leaf init-pwr {
 *                             type int64;
 *                         }
 *                         leaf pwr-step-indb {
 *                             type uint8;
 *                         }
 *                         leaf nom-pwr-ext {
 *                             type nom-pwr-ext;
 *                         }
 *                         leaf apm-auth {
 *                             type uint8;
 *                         }
 *                         leaf apm-rand-update-prd {
 *                             type apm-rand-update-prd;
 *                         }
 *                         leaf initialpwr {
 *                             type initialpwr;
 *                         }
 *                         leaf pwr-step {
 *                             type pwr-step;
 *                         }
 *                         leaf num-step {
 *                             type uint8;
 *                         }
 *                         leaf max-cap-size {
 *                             type uint8;
 *                         }
 *                         leaf preamble-size {
 *                             type uint8;
 *                         }
 *                         leaf psist09 {
 *                             type uint8;
 *                         }
 *                         leaf psist10 {
 *                             type uint8;
 *                         }
 *                         leaf psist11 {
 *                             type uint8;
 *                         }
 *                         leaf psist12 {
 *                             type uint8;
 *                         }
 *                         leaf psist13 {
 *                             type uint8;
 *                         }
 *                         leaf psist14 {
 *                             type uint8;
 *                         }
 *                         leaf psist15 {
 *                             type uint8;
 *                         }
 *                         leaf msg-psist {
 *                             type uint8;
 *                         }
 *                         leaf reg-psist {
 *                             type uint8;
 *                         }
 *                         leaf probe-pn-ran {
 *                             type uint8;
 *                         }
 *                         leaf acc-tmo {
 *                             type acc-tmo;
 *                         }
 *                         leaf probe-bkoff {
 *                             type probe-bkoff;
 *                         }
 *                         leaf bkoff {
 *                             type bkoff;
 *                         }
 *                         leaf max-req-seq {
 *                             type uint8;
 *                         }
 *                         leaf max-rsp-seq {
 *                             type uint8;
 *                         }
 *                         uses cdma2000-one-x-ran-access-parameters-g;
 *                     }
 *                     container cdma2000-one-x-ran-system-parameters {
 *                         leaf reg-zone {
 *                             type uint16;
 *                         }
 *                         leaf total-zones {
 *                             type uint8;
 *                         }
 *                         leaf zone-timer {
 *                             type uint8;
 *                         }
 *                         leaf reg-period {
 *                             type uint8;
 *                         }
 *                         leaf srch-win-a {
 *                             type uint8;
 *                         }
 *                         leaf srch-win-n {
 *                             type uint8;
 *                         }
 *                         leaf srch-win-r {
 *                             type uint8;
 *                         }
 *                         leaf nghbr-max-age {
 *                             type uint8;
 *                         }
 *                         leaf pwr-rep-thresh {
 *                             type uint8;
 *                         }
 *                         leaf pwr-rep-frames {
 *                             type uint8;
 *                         }
 *                         leaf pwr-thresh-enable {
 *                             type uint8;
 *                         }
 *                         leaf pwr-period-enable {
 *                             type uint8;
 *                         }
 *                         leaf pwr-rep-delay {
 *                             type uint8;
 *                         }
 *                         leaf rescan {
 *                             type uint8;
 *                         }
 *                         leaf tadd {
 *                             type tadd;
 *                         }
 *                         leaf tdrop {
 *                             type tdrop;
 *                         }
 *                         leaf tcomp {
 *                             type tcomp;
 *                         }
 *                         leaf t-tdrop {
 *                             type uint8;
 *                         }
 *                         leaf in-traffic-tadd {
 *                             type in-traffic-tadd;
 *                         }
 *                         leaf in-traffic-tdrop {
 *                             type in-traffic-tdrop;
 *                         }
 *                         leaf in-traffic-tcomp {
 *                             type in-traffic-tcomp;
 *                         }
 *                         leaf in-traffic-ttdrop {
 *                             type uint8;
 *                         }
 *                         uses cdma2000-one-x-ran-system-parameters-g;
 *                     }
 *                     container cdma2000-one-x-ran-extended-system-parameters {
 *                         leaf prev {
 *                             type uint8;
 *                         }
 *                         leaf p-min-rev {
 *                             type uint8;
 *                         }
 *                         leaf delete-for-tmsi {
 *                             type uint8;
 *                         }
 *                         leaf use-tmsi {
 *                             type uint8;
 *                         }
 *                         leaf pref-msid-type {
 *                             type uint8;
 *                         }
 *                         leaf mcc {
 *                             type uint16;
 *                         }
 *                         leaf imsi1112 {
 *                             type uint8;
 *                         }
 *                         leaf tmsi-zone-len {
 *                             type uint8;
 *                         }
 *                         leaf tmsi-zone {
 *                             type uint16;
 *                         }
 *                         leaf bcast-index {
 *                             type uint8;
 *                         }
 *                         leaf imsit-supported {
 *                             type int64;
 *                         }
 *                         leaf soft-slope {
 *                             type uint8;
 *                         }
 *                         leaf add-intercept {
 *                             type add-intercept;
 *                         }
 *                         leaf drop-intercept {
 *                             type drop-intercept;
 *                         }
 *                         leaf max-num-alt-so {
 *                             type uint8;
 *                         }
 *                         leaf reselected-included {
 *                             type uint8;
 *                         }
 *                         leaf ec-thresh {
 *                             type ec-thresh;
 *                         }
 *                         leaf ec-io-thresh {
 *                             type uint64;
 *                         }
 *                         leaf pilot-report {
 *                             type uint8;
 *                         }
 *                         leaf nghbr-set-entry-info {
 *                             type uint8;
 *                         }
 *                         leaf access-ho-order {
 *                             type uint8;
 *                         }
 *                         leaf nghbr-set-access-info {
 *                             type uint8;
 *                         }
 *                         leaf access-ho {
 *                             type uint8;
 *                         }
 *                         leaf access-ho-msg-rsp {
 *                             type uint8;
 *                         }
 *                         leaf access-probe-ho {
 *                             type uint8;
 *                         }
 *                         leaf acc-ho-list-upd {
 *                             type uint8;
 *                         }
 *                         leaf acc-probe-ho-other-msg {
 *                             type uint8;
 *                         }
 *                         leaf max-num-probe-ho {
 *                             type uint8;
 *                         }
 *                         leaf brdcast-gps-assit {
 *                             type uint8;
 *                         }
 *                         leaf qpch-supported {
 *                             type uint8;
 *                         }
 *                         leaf num-qpch {
 *                             type uint8;
 *                         }
 *                         leaf qpch-rate {
 *                             type uint8;
 *                         }
 *                         leaf qpch-pwr-level-page {
 *                             type uint8;
 *                         }
 *                         leaf qpc-hcci-supported {
 *                             type uint8;
 *                         }
 *                         leaf qpch-pwr-level-config {
 *                             type uint8;
 *                         }
 *                         leaf sdb-supported {
 *                             type uint8;
 *                         }
 *                         leaf r-lgain-traffic-pilot {
 *                             type r-lgain-traffic-pilot;
 *                         }
 *                         leaf rvs-pwr-ctrl-delay-incl {
 *                             type uint8;
 *                         }
 *                         leaf rvs-pwr-ctrl-delay {
 *                             type rvs-pwr-ctrl-delay;
 *                         }
 *                         uses cdma2000-one-x-ran-extended-system-parameters-g;
 *                     }
 *                     container cdma2000-one-x-ran-forward-pwr-ctr {
 *                         leaf fpcfch-init-setpt {
 *                             type fpcfch-init-setpt;
 *                         }
 *                         leaf fpc-subchan-gain {
 *                             type fpc-subchan-gain;
 *                         }
 *                         leaf rl-gain-adj {
 *                             type rl-gain-adj;
 *                         }
 *                         leaf fpcfchfer {
 *                             type uint8;
 *                         }
 *                         leaf fpcfch-min-setpt {
 *                             type fpcfch-min-setpt;
 *                         }
 *                         leaf fpcfch-max-setpt {
 *                             type fpcfch-max-setpt;
 *                         }
 *                         uses cdma2000-one-x-ran-forward-pwr-ctr-g;
 *                     }
 *                     container cdma2000-one-x-ran-hard-handoff {
 *                         leaf handout-enable {
 *                             type boolean;
 *                         }
 *                         leaf ho-pilot-power-thresh {
 *                             type ho-pilot-power-thresh;
 *                         }
 *                         leaf ho-pilot-duration {
 *                             type ho-pilot-duration;
 *                         }
 *                         container cdma2000-one-x-ran-hard-handoff-stats {
 *                             leaf tx-ho-required {
 *                                 type uint32;
 *                             }
 *                             leaf rx-ho-command {
 *                                 type uint32;
 *                             }
 *                             leaf ho-required-rejected {
 *                                 type uint32;
 *                             }
 *                             leaf ho-required-unanswered {
 *                                 type uint32;
 *                             }
 *                             leaf tx-uhdm {
 *                                 type uint32;
 *                             }
 *                             leaf rx-ns-ack {
 *                                 type uint32;
 *                             }
 *                             leaf ho-failure-count {
 *                                 type uint32;
 *                             }
 *                             leaf call-drop-count {
 *                                 type uint32;
 *                             }
 *                             leaf tx-ho-commence {
 *                                 type uint32;
 *                             }
 *                             leaf rx-ho-session-clear {
 *                                 type uint32;
 *                             }
 *                             leaf return-on-failure-count {
 *                                 type uint32;
 *                             }
 *                             leaf one-pilot-report-count {
 *                                 type uint32;
 *                             }
 *                             leaf two-pilot-report-count {
 *                                 type uint32;
 *                             }
 *                             leaf three-pilot-report-count {
 *                                 type uint32;
 *                             }
 *                             uses cdma2000-one-x-ran-hard-handoff-stats-g;
 *                         }
 *                         uses cdma2000-one-x-ran-hard-handoff-g;
 *                     }
 *                     container cdma2000-one-x-ran-power-control {
 *                         leaf one-xpcfpc-incl {
 *                             type int64;
 *                         }
 *                         leaf one-xpcfpcfch-min-setpt {
 *                             type one-xpcfpcfch-min-setpt;
 *                         }
 *                         leaf one-xpcfpcfch-max-setpt {
 *                             type one-xpcfpcfch-max-setpt;
 *                         }
 *                         leaf one-xpcrpc-incl {
 *                             type int64;
 *                         }
 *                         leaf one-xpcfch-chan-adj-gain {
 *                             type one-xpcfch-chan-adj-gain;
 *                         }
 *                         leaf one-xpc-pwr-rep-thresh {
 *                             type uint8;
 *                         }
 *                         leaf one-xpc-pwr-rep-frames {
 *                             type uint8;
 *                         }
 *                         leaf one-x-pwr-thresh-enable {
 *                             type int64;
 *                         }
 *                         leaf one-xpc-pwr-period-enable {
 *                             type int64;
 *                         }
 *                         leaf one-xpc-pwr-rep-delay {
 *                             type one-xpc-pwr-rep-delay;
 *                         }
 *                         uses cdma2000-one-x-ran-power-control-g;
 *                     }
 *                     list cdma2000-one-x-ran-neighbor-list {
 *                         key "one-x-neighbor-index" "neighbor-pn";
 *                         leaf enable {
 *                             type boolean;
 *                         }
 *                         leaf alias {
 *                             type string;
 *                         }
 *                         leaf pilot-inc {
 *                             type int64;
 *                         }
 *                         leaf one-x-neighbor-index {
 *                             type int64;
 *                         }
 *                         leaf neighbor-config {
 *                             type enumeration;
 *                         }
 *                         leaf neighbor-pn {
 *                             type int64;
 *                         }
 *                         leaf search-priority {
 *                             type enumeration;
 *                         }
 *                         leaf neighbor-band {
 *                             type enumeration;
 *                         }
 *                         leaf neighbor-frequency {
 *                             type int64;
 *                         }
 *                         leaf frequency-included {
 *                             type int64;
 *                         }
 *                         leaf in-traffic {
 *                             type int64;
 *                         }
 *                         leaf overhead-msg {
 *                             type int64;
 *                         }
 *                         leaf base-identifier {
 *                             type int64;
 *                         }
 *                         leaf air-interface {
 *                             type enumeration;
 *                         }
 *                         leaf hand-out-capable {
 *                             type int64;
 *                         }
 *                         leaf one-x-neighbor-longitude {
 *                             type string;
 *                         }
 *                         leaf one-x-neighbor-latitude {
 *                             type string;
 *                         }
 *                         leaf one-x-neighbor-msc-id {
 *                             type uint32;
 *                         }
 *                         leaf one-x-neighbor-ios-cell-id {
 *                             type uint16;
 *                         }
 *                         leaf force-in-overhead {
 *                             type boolean;
 *                         }
 *                         leaf included-in-overhead {
 *                             type boolean;
 *                         }
 *                         uses cdma2000-one-x-ran-neighbor-list-g;
 *                     }
 *                     container cdma2000-one-x-ran-apidm {
 *                         leaf association-type {
 *                             type uint8;
 *                         }
 *                         leaf apidlen {
 *                             type uint8;
 *                         }
 *                         leaf apid {
 *                             type binary;
 *                         }
 *                         leaf apidmask {
 *                             type uint8;
 *                         }
 *                         leaf iosmscid {
 *                             type uint32;
 *                         }
 *                         leaf ioscellid {
 *                             type uint16;
 *                         }
 *                         leaf intrafreqhohysincl {
 *                             type boolean;
 *                         }
 *                         leaf intrafreqhohys {
 *                             type uint8;
 *                         }
 *                         leaf intrafreqhoslopeincl {
 *                             type boolean;
 *                         }
 *                         leaf intrafreqhoslope {
 *                             type uint8;
 *                         }
 *                         leaf interfreqhohysincl {
 *                             type boolean;
 *                         }
 *                         leaf interfreqhohys {
 *                             type uint8;
 *                         }
 *                         leaf interfreqhoslopeincl {
 *                             type boolean;
 *                         }
 *                         leaf interfreqhoslope {
 *                             type uint8;
 *                         }
 *                         leaf interfreqsrchthincl {
 *                             type boolean;
 *                         }
 *                         leaf interfreqsrchth {
 *                             type uint8;
 *                         }
 *                         uses cdma2000-one-x-ran-apidm-g;
 *                     }
 *                     container cdma2000-one-x-ran-apidtm {
 *                         leaf apidtextcha-ri-len {
 *                             type uint16;
 *                         }
 *                         leaf apidtextmsgencoding {
 *                             type uint8;
 *                         }
 *                         leaf apidtextcha-ri {
 *                             type string;
 *                         }
 *                         uses cdma2000-one-x-ran-apidtm-g;
 *                     }
 *                     container cdma2000-one-x-ran-appim {
 *                         leaf lifetime {
 *                             type uint8;
 *                         }
 *                         leaf numappirec {
 *                             type uint16;
 *                         }
 *                         leaf appirec-number-of-entries {
 *                             type uint64;
 *                         }
 *                         list cdma2000-one-x-ran-appim-appirec {
 *                             key "apsid" "apnid" "apband" "apfreq" "appnrectype" "appnreclen" "appnrec";
 *                             leaf enable {
 *                                 type boolean;
 *                             }
 *                             leaf alias {
 *                                 type string;
 *                             }
 *                             leaf apassntype {
 *                                 type uint8;
 *                             }
 *                             leaf apsidsameasprevious {
 *                                 type uint8;
 *                             }
 *                             leaf apnidsameasprevious {
 *                                 type uint8;
 *                             }
 *                             leaf apbandsameasprevious {
 *                                 type uint8;
 *                             }
 *                             leaf apfreqsameasprevious {
 *                                 type uint8;
 *                             }
 *                             leaf appnrecsameasprevious {
 *                                 type uint8;
 *                             }
 *                             leaf apsid {
 *                                 type uint16;
 *                             }
 *                             leaf apnid {
 *                                 type uint16;
 *                             }
 *                             leaf apband {
 *                                 type uint8;
 *                             }
 *                             leaf apfreq {
 *                                 type uint16;
 *                             }
 *                             leaf appnrectype {
 *                                 type uint8;
 *                             }
 *                             leaf appnreclen {
 *                                 type uint8;
 *                             }
 *                             leaf appnrec {
 *                                 type binary;
 *                             }
 *                             uses cdma2000-one-x-ran-appim-appirec-g;
 *                         }
 *                         uses cdma2000-one-x-ran-appim-g;
 *                     }
 *                     uses cdma2000-one-x-ran-g;
 *                 }
 *                 container cdma2000-one-x-pcf-config {
 *                     leaf pcfpdsn-health-monitor-interval {
 *                         type pcfpdsn-health-monitor-interval;
 *                     }
 *                     container cdma2000-one-x-pcf-config-pcf-performance-stats {
 *                         leaf a10-setup-failure-no-reason {
 *                             type uint64;
 *                         }
 *                         leaf a10-setup-failure-admin-prohibit {
 *                             type uint64;
 *                         }
 *                         leaf a10-setup-failure-insuff-resources {
 *                             type uint64;
 *                         }
 *                         leaf a10-setup-failure-failed-auth {
 *                             type uint64;
 *                         }
 *                         leaf a10-setup-failure-id-mismatch {
 *                             type uint64;
 *                         }
 *                         leaf a10-setup-failure-malformed-req {
 *                             type uint64;
 *                         }
 *                         leaf a10-setup-failure-unknown-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a10-setup-failure-unsupp-vend-id {
 *                             type uint64;
 *                         }
 *                         leaf total-a10-closed-by-rnc {
 *                             type uint64;
 *                         }
 *                         leaf total-a10-closed-by-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf total-a10-success-pages {
 *                             type uint64;
 *                         }
 *                         leaf total-a10-failed-pages {
 *                             type uint64;
 *                         }
 *                         leaf total-a10-ingress-bytes {
 *                             type total-a10-ingress-bytes;
 *                         }
 *                         leaf total-a10-egress-bytes {
 *                             type total-a10-egress-bytes;
 *                         }
 *                         leaf a10-reg-update-received {
 *                             type uint64;
 *                         }
 *                         leaf total-a10-dropped-pages {
 *                             type uint64;
 *                         }
 *                         uses cdma2000-one-x-pcf-config-pcf-performance-stats-g;
 *                     }
 *                     uses cdma2000-one-x-pcf-config-g;
 *                 }
 *                 list cdma2000-one-x-batch-pcfpdsn {
 *                     key "batch-table-number";
 *                     leaf enable {
 *                         type boolean;
 *                     }
 *                     leaf alias {
 *                         type string;
 *                     }
 *                     leaf batch-table-number {
 *                         type int64;
 *                     }
 *                     leaf batch-table-start-ip-address {
 *                         type ip-address;
 *                     }
 *                     leaf batch-table-end-ip-address {
 *                         type ip-address;
 *                     }
 *                     leaf batch-table-security-parameter-index {
 *                         type uint32;
 *                     }
 *                     leaf batch-table-secret-key {
 *                         type binary;
 *                     }
 *                     leaf batch-table-ios-version {
 *                         type enumeration;
 *                     }
 *                     leaf batch-table-pdsn-admin-status {
 *                         type int64;
 *                     }
 *                     leaf pdsn-type {
 *                         type enumeration;
 *                     }
 *                     uses cdma2000-one-x-batch-pcfpdsn-g;
 *                 }
 *                 list cdma2000-one-x-pcfpdsn {
 *                     key "pdsn-number" "security-parameter-index" "security-key";
 *                     leaf enable {
 *                         type boolean;
 *                     }
 *                     leaf alias {
 *                         type string;
 *                     }
 *                     leaf pdsn-number {
 *                         type int64;
 *                     }
 *                     leaf security-parameter-index {
 *                         type uint32;
 *                     }
 *                     leaf security-key {
 *                         type binary;
 *                     }
 *                     leaf ios-version {
 *                         type enumeration;
 *                     }
 *                     leaf pds-nadmin-status {
 *                         type int64;
 *                     }
 *                     leaf pdsn-health-status {
 *                         type uint8;
 *                     }
 *                     leaf pdsnip-address {
 *                         type ip-address;
 *                     }
 *                     container cdma2000-one-x-pcfpdsn-a11-reg-update-stats {
 *                         leaf pdsn-number-reg-update-perf {
 *                             type int64;
 *                         }
 *                         leaf pdsnip-address-reg-update-perf {
 *                             type ip-address;
 *                         }
 *                         leaf a11-reg-update-received-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-update-id-check-fail-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-update-auth-check-fail-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-update-for-unknown-psipdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-update-unspecified-reason-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-update-ppp-timeout-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-update-registration-timeout-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-update-pdsn-error-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-update-inter-pcf-handoff-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-update-inter-pdsn-handoff-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-update-pdsnoamp-intervention-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-update-accounting-error-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-update-user-failed-authentication-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-update-unknown-cause-code-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-update-without-reason-code-pdsn {
 *                             type uint64;
 *                         }
 *                         uses cdma2000-one-x-pcfpdsn-a11-reg-update-stats-g;
 *                     }
 *                     container cdma2000-one-x-pcfpdsn-pcfpdsn-stats {
 *                         leaf a10-setup-attempts-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a10-setup-successes-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a10-setup-blocks-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-req-denied-id-mismatch-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-req-denied-unknown-pdsnpdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-req-denied-no-reason-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-req-denied-admin-prohibit-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-req-denied-insuff-resources-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-req-denied-failed-auth-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-req-denied-malformed-req-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-req-denied-unsupp-vend-id-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-req-denied-reverse-tunnel-unavailable-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-req-denied-reverse-tunnel-tbit-not-set-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-req-denied-unknown-error-code-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a10-reg-req-for-registration-retransmissions-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a10-reg-req-for-re-registration-retransmissions-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a10-reg-req-for-release-retransmissions-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf pdsn-number-pdsn-perf {
 *                             type int64;
 *                         }
 *                         leaf pds-nip-address-pdsn-perf {
 *                             type ip-address;
 *                         }
 *                         uses cdma2000-one-x-pcfpdsn-pcfpdsn-stats-g;
 *                     }
 *                     uses cdma2000-one-x-pcfpdsn-g;
 *                 }
 *                 container cdma2000-one-x-stats {
 *                     leaf registration-attempts {
 *                         type uint32;
 *                     }
 *                     leaf registration-fails {
 *                         type uint32;
 *                     }
 *                     leaf registrations-blocked {
 *                         type uint32;
 *                     }
 *                     leaf page-attempts {
 *                         type uint32;
 *                     }
 *                     leaf page-fails {
 *                         type uint32;
 *                     }
 *                     leaf voice-call-attempts {
 *                         type uint32;
 *                     }
 *                     leaf voice-call-failures {
 *                         type uint32;
 *                     }
 *                     leaf voice-calls-blocked {
 *                         type uint32;
 *                     }
 *                     leaf voice-calls-dropped {
 *                         type uint32;
 *                     }
 *                     leaf data-call-attempts {
 *                         type uint32;
 *                     }
 *                     leaf data-call-failures {
 *                         type uint32;
 *                     }
 *                     leaf data-calls-blocked {
 *                         type uint32;
 *                     }
 *                     leaf data-calls-dropped {
 *                         type uint32;
 *                     }
 *                     leaf average-voice-call {
 *                         type average-voice-call;
 *                     }
 *                     leaf average-data-call {
 *                         type average-data-call;
 *                     }
 *                     leaf average-session-in-sec {
 *                         type average-session-in-sec;
 *                     }
 *                     leaf total-voice-calls {
 *                         type total-voice-calls;
 *                     }
 *                     leaf total-data-calls {
 *                         type uint32;
 *                     }
 *                     leaf fwd-voice-packet-drop-percentage {
 *                         type uint32;
 *                     }
 *                     leaf rev-voice-packet-drop-percentage {
 *                         type uint32;
 *                     }
 *                     leaf fwd-avg-data-rate {
 *                         type uint32;
 *                     }
 *                     leaf rev-avg-data-rate {
 *                         type uint32;
 *                     }
 *                     leaf bc-index-zero-to-one-transitions {
 *                         type uint32;
 *                     }
 *                     leaf bc-index-one-to-zero-transitions {
 *                         type uint32;
 *                     }
 *                     uses cdma2000-one-x-stats-g;
 *                 }
 *                 container cdma2000-one-x-redirect {
 *                     leaf redirect-channel-number {
 *                         type uint16;
 *                     }
 *                     leaf redirect-band-class {
 *                         type uint8;
 *                     }
 *                     uses cdma2000-one-x-redirect-g;
 *                 }
 *                 uses cdma2000-one-x-g;
 *             }
 *             container cdma2000-hrpd {
 *                 leaf pcfpdsn-number-of-entries {
 *                     type uint64;
 *                 }
 *                 leaf max-batch-pcfpdsn-entries {
 *                     type uint64;
 *                 }
 *                 leaf batch-pcfpdsn-number-of-entries {
 *                     type uint64;
 *                 }
 *                 container cdma2000-hrpd-ran {
 *                     container cdma2000-hrpd-ran-rf {
 *                         leaf hrpd-car-band-class {
 *                             type uint8;
 *                         }
 *                         leaf-list rfcnfl {
 *                             type string;
 *                         }
 *                         leaf rfcnfl-in-use {
 *                             type uint64;
 *                         }
 *                         leaf-list pilot-pn {
 *                             type string;
 *                         }
 *                         leaf pilot-pn-in-use {
 *                             type uint64;
 *                         }
 *                         leaf maxfap-tx-power {
 *                             type string;
 *                         }
 *                         leaf maxfap-tx-power-in-use {
 *                             type maxfap-tx-power-in-use;
 *                         }
 *                         leaf control-channel-rate {
 *                             type int64;
 *                         }
 *                         leaf sync-capsule-offset {
 *                             type int64;
 *                         }
 *                         leaf rab-length {
 *                             type int64;
 *                         }
 *                         leaf rab-offset {
 *                             type int64;
 *                         }
 *                         leaf sector-id {
 *                             type binary;
 *                         }
 *                         leaf color-code {
 *                             type int64;
 *                         }
 *                         leaf subnet-mask-length {
 *                             type subnet-mask-length;
 *                         }
 *                         leaf hrpd-sec-el-reverse-link-silence-duration {
 *                             type hrpd-sec-el-reverse-link-silence-duration;
 *                         }
 *                         leaf hrpd-sec-el-reverse-link-silence-period {
 *                             type hrpd-sec-el-reverse-link-silence-period;
 *                         }
 *                         leaf open-loop-adjust {
 *                             type open-loop-adjust;
 *                         }
 *                         leaf probe-initial-adjust {
 *                             type probe-initial-adjust;
 *                         }
 *                         leaf probe-num-steps {
 *                             type int64;
 *                         }
 *                         leaf probe-power-step {
 *                             type probe-power-step;
 *                         }
 *                         leaf a-persistence {
 *                             type string;
 *                         }
 *                         leaf rssirab-threshold {
 *                             type rssirab-threshold;
 *                         }
 *                         leaf load-rab-threshold {
 *                             type load-rab-threshold;
 *                         }
 *                         leaf connection-rate-limit {
 *                             type uint8;
 *                         }
 *                         leaf rfe-rl-balance-ratio {
 *                             type uint8;
 *                         }
 *                         uses cdma2000-hrpd-ran-rf-g;
 *                     }
 *                     uses cdma2000-hrpd-ran-g;
 *                 }
 *                 container cdma2000-hrpd-pcf-config {
 *                     leaf pcfpdsn-health-monitor-interval {
 *                         type pcfpdsn-health-monitor-interval;
 *                     }
 *                     container cdma2000-hrpd-pcf-config-pcf-performance-stats {
 *                         leaf a10-setup-failure-no-reason {
 *                             type uint64;
 *                         }
 *                         leaf a10-setup-failure-admin-prohibit {
 *                             type uint64;
 *                         }
 *                         leaf a10-setup-failure-insuff-resources {
 *                             type uint64;
 *                         }
 *                         leaf a10-setup-failure-failed-auth {
 *                             type uint64;
 *                         }
 *                         leaf a10-setup-failure-id-mismatch {
 *                             type uint64;
 *                         }
 *                         leaf a10-setup-failure-malformed-req {
 *                             type uint64;
 *                         }
 *                         leaf a10-setup-failure-unknown-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a10-setup-failure-unsupp-vend-id {
 *                             type uint64;
 *                         }
 *                         leaf total-a10-closed-by-rnc {
 *                             type uint64;
 *                         }
 *                         leaf total-a10-closed-by-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf total-a10-success-pages {
 *                             type uint64;
 *                         }
 *                         leaf total-a10-failed-pages {
 *                             type uint64;
 *                         }
 *                         leaf total-a10-ingress-bytes {
 *                             type total-a10-ingress-bytes;
 *                         }
 *                         leaf total-a10-egress-bytes {
 *                             type total-a10-egress-bytes;
 *                         }
 *                         leaf a10-reg-update-received {
 *                             type uint64;
 *                         }
 *                         leaf total-a10-dropped-pages {
 *                             type uint64;
 *                         }
 *                         uses cdma2000-hrpd-pcf-config-pcf-performance-stats-g;
 *                     }
 *                     uses cdma2000-hrpd-pcf-config-g;
 *                 }
 *                 list cdma2000-hrpd-batch-pcfpdsn {
 *                     key "batch-table-number" "batch-table-security-parameter-index" "batch-table-secret-key";
 *                     leaf enable {
 *                         type boolean;
 *                     }
 *                     leaf alias {
 *                         type string;
 *                     }
 *                     leaf batch-table-number {
 *                         type int64;
 *                     }
 *                     leaf batch-table-start-ip-address {
 *                         type ip-address;
 *                     }
 *                     leaf batch-table-end-ip-address {
 *                         type ip-address;
 *                     }
 *                     leaf batch-table-security-parameter-index {
 *                         type uint32;
 *                     }
 *                     leaf batch-table-secret-key {
 *                         type binary;
 *                     }
 *                     leaf batch-table-ios-version {
 *                         type enumeration;
 *                     }
 *                     leaf batch-table-pdsn-admin-status {
 *                         type int64;
 *                     }
 *                     leaf pdsn-type {
 *                         type string;
 *                     }
 *                     uses cdma2000-hrpd-batch-pcfpdsn-g;
 *                 }
 *                 list cdma2000-hrpd-pcfpdsn {
 *                     key "pdsn-number" "security-parameter-index" "security-key";
 *                     leaf enable {
 *                         type boolean;
 *                     }
 *                     leaf alias {
 *                         type string;
 *                     }
 *                     leaf pdsn-number {
 *                         type int64;
 *                     }
 *                     leaf security-parameter-index {
 *                         type uint32;
 *                     }
 *                     leaf security-key {
 *                         type binary;
 *                     }
 *                     leaf ios-version {
 *                         type enumeration;
 *                     }
 *                     leaf pds-nadmin-status {
 *                         type int64;
 *                     }
 *                     leaf pdsn-health-status {
 *                         type uint8;
 *                     }
 *                     leaf pdsnip-address {
 *                         type ip-address;
 *                     }
 *                     container cdma2000-hrpd-pcfpdsn-a11-session-update-stats {
 *                         leaf pdsn-number-session-update-perf {
 *                             type int64;
 *                         }
 *                         leaf pdsnip-address-session-update-perf {
 *                             type ip-address;
 *                         }
 *                         leaf a11-session-update-received-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-session-update-accepted-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-session-update-extended-apipdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-session-update-for-unknown-psipdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-session-update-denied-id-check-fail-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-session-update-denied-auth-check-fail-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-session-update-denied-reason-unspecified-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-session-update-denied-poorly-formed-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-session-update-denied-session-params-not-updated-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-session-update-denied-qo-s-profile-id-not-supported-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-session-update-denied-insufficient-resources-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-session-update-denied-handoff-in-progress-pdsn {
 *                             type uint64;
 *                         }
 *                         uses cdma2000-hrpd-pcfpdsn-a11-session-update-stats-g;
 *                     }
 *                     container cdma2000-hrpd-pcfpdsn-a11-reg-update-stats {
 *                         leaf pdsn-number-reg-update-perf {
 *                             type int64;
 *                         }
 *                         leaf pdsnip-address-reg-update-perf {
 *                             type ip-address;
 *                         }
 *                         leaf a11-reg-update-received-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-update-id-check-fail-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-update-auth-check-fail-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-update-for-unknown-psipdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-update-unspecified-reason-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-update-ppp-timeout-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-update-registration-timeout-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-update-pdsn-error-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-update-inter-pcf-handoff-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-update-inter-pdsn-handoff-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-update-pdsnoamp-intervention-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-update-accounting-error-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-update-user-failed-authentication-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-update-unknown-cause-code-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-update-without-reason-code-pdsn {
 *                             type uint64;
 *                         }
 *                         uses cdma2000-hrpd-pcfpdsn-a11-reg-update-stats-g;
 *                     }
 *                     container cdma2000-hrpd-pcfpdsn-aux-a10-stats {
 *                         leaf pdsn-number-aux-a10-perf {
 *                             type int64;
 *                         }
 *                         leaf pdsnip-address-aux-a10-perf {
 *                             type ip-address;
 *                         }
 *                         leaf aux-a10-connections-created-in-first-reg-req-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf aux-a10-connections-created-in-subsequent-reg-req-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf aux-a10-fwd-ip-flows-created-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf aux-a10-rev-ip-flows-created-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf aux-a10-ip-flow-accounting-reg-requests-pdsn {
 *                             type uint64;
 *                         }
 *                         uses cdma2000-hrpd-pcfpdsn-aux-a10-stats-g;
 *                     }
 *                     container cdma2000-hrpd-pcfpdsn-pcfpdsn-stats {
 *                         leaf a10-setup-attempts-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a10-setup-successes-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a10-setup-blocks-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-req-denied-id-mismatch-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-req-denied-unknown-pdsnpdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-req-denied-no-reason-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-req-denied-admin-prohibit-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-req-denied-insuff-resources-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-req-denied-failed-auth-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-req-denied-malformed-req-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-req-denied-unsupp-vend-id-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-req-denied-reverse-tunnel-unavailable-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-req-denied-reverse-tunnel-tbit-not-set-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a11-reg-req-denied-unknown-error-code-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a10-reg-req-for-registration-retransmissions-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a10-reg-req-for-re-registration-retransmissions-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf a10-reg-req-for-release-retransmissions-pdsn {
 *                             type uint64;
 *                         }
 *                         leaf pdsn-number-pdsn-perf {
 *                             type int64;
 *                         }
 *                         leaf pds-nip-address-pdsn-perf {
 *                             type ip-address;
 *                         }
 *                         uses cdma2000-hrpd-pcfpdsn-pcfpdsn-stats-g;
 *                     }
 *                     uses cdma2000-hrpd-pcfpdsn-g;
 *                 }
 *                 container cdma2000-hrpd-redirect {
 *                     leaf redirect-channel-number {
 *                         type uint16;
 *                     }
 *                     leaf redirect-band-class {
 *                         type uint8;
 *                     }
 *                     uses cdma2000-hrpd-redirect-g;
 *                 }
 *                 container cdma2000-hrpd-call-control-stats {
 *                     leaf num-session-setup-attempts {
 *                         type uint64;
 *                     }
 *                     leaf num-session-setup-successful {
 *                         type uint64;
 *                     }
 *                     leaf num-current-sessions-established {
 *                         type uint64;
 *                     }
 *                     leaf num-page-messages-to-at {
 *                         type uint64;
 *                     }
 *                     leaf num-pages-succeeded {
 *                         type uint64;
 *                     }
 *                     leaf num-connections-opened {
 *                         type uint64;
 *                     }
 *                     leaf num-session-setups-failed-to-term-auth {
 *                         type uint64;
 *                     }
 *                     leaf num-forward-rlp-bytes {
 *                         type num-forward-rlp-bytes;
 *                     }
 *                     leaf num-reverse-rlp-bytes {
 *                         type num-reverse-rlp-bytes;
 *                     }
 *                     leaf average-session-setup-time {
 *                         type average-session-setup-time;
 *                     }
 *                     leaf average-page-setup-time {
 *                         type uint64;
 *                     }
 *                     leaf num-conn-setups-aborted {
 *                         type uint64;
 *                     }
 *                     leaf num-forward-pre-rlp-dropped-pkts {
 *                         type uint64;
 *                     }
 *                     uses cdma2000-hrpd-call-control-stats-g;
 *                 }
 *                 container cdma2000-hrpd-qo-s-stats {
 *                     leaf num-qo-s-subscriber-profile-updates-rcvd {
 *                         type uint64;
 *                     }
 *                     leaf num-pdsnip-flow-updates-msg-rcvd {
 *                         type uint64;
 *                     }
 *                     leaf num-pdsnip-flow-updates-msg-failed {
 *                         type uint64;
 *                     }
 *                     leaf num-qo-s-setup-requests-received {
 *                         type uint64;
 *                     }
 *                     leaf num-qo-s-setup-requests-accepted {
 *                         type uint64;
 *                     }
 *                     leaf num-qo-s-setup-requests-rejected {
 *                         type uint64;
 *                     }
 *                     leaf num-reservation-on-requests-received {
 *                         type uint64;
 *                     }
 *                     leaf num-reservation-on-requests-accepted {
 *                         type uint64;
 *                     }
 *                     leaf num-reservation-on-requests-rejected {
 *                         type uint64;
 *                     }
 *                     leaf num-reservation-on-requests-failed {
 *                         type uint64;
 *                     }
 *                     leaf num-fwd-reservation-on-messages-sent {
 *                         type uint64;
 *                     }
 *                     leaf num-rev-reservation-on-messages-sent {
 *                         type uint64;
 *                     }
 *                     leaf num-reservation-off-requests-received {
 *                         type uint64;
 *                     }
 *                     leaf num-reservation-off-requests-accepted {
 *                         type uint64;
 *                     }
 *                     leaf num-reservation-off-requests-rejected {
 *                         type uint64;
 *                     }
 *                     leaf num-fwd-reservation-off-messages-sent {
 *                         type uint64;
 *                     }
 *                     leaf num-rev-reservation-off-messages-sent {
 *                         type uint64;
 *                     }
 *                     leaf num-qo-s-release-requests-received {
 *                         type uint64;
 *                     }
 *                     leaf num-connection-close-initiated-no-ran-rsr {
 *                         type uint64;
 *                     }
 *                     uses cdma2000-hrpd-qo-s-stats-g;
 *                 }
 *                 container cdma2000-hrpd-rnc-sig-apps-stats {
 *                     leaf c-num-page-requests {
 *                         type uint64;
 *                     }
 *                     leaf s-num-page-requests {
 *                         type uint64;
 *                     }
 *                     leaf s-num-connection-setup-attempts {
 *                         type uint64;
 *                     }
 *                     leaf c-num-connection-setup-attempts {
 *                         type uint64;
 *                     }
 *                     leaf s-num-connection-setup-success {
 *                         type uint64;
 *                     }
 *                     leaf c-num-connection-setup-success {
 *                         type uint64;
 *                     }
 *                     leaf s-num-normal-connection-closes {
 *                         type uint64;
 *                     }
 *                     leaf c-num-normal-connection-closes {
 *                         type uint64;
 *                     }
 *                     leaf s-num-total-connection-closes {
 *                         type uint64;
 *                     }
 *                     leaf c-num-total-connection-closes {
 *                         type uint64;
 *                     }
 *                     leaf s-num-rf-related-drops {
 *                         type uint64;
 *                     }
 *                     leaf c-num-rf-related-drops {
 *                         type uint64;
 *                     }
 *                     leaf s-num-page-responses {
 *                         type uint64;
 *                     }
 *                     leaf c-num-page-responses {
 *                         type uint64;
 *                     }
 *                     leaf s-num-rf-related-drops-rtc-lost {
 *                         type uint64;
 *                     }
 *                     leaf c-num-rf-related-drops-rtc-lost {
 *                         type uint64;
 *                     }
 *                     leaf s-num-rf-related-drops-no-ftc {
 *                         type uint64;
 *                     }
 *                     leaf c-num-rf-related-drops-no-ftc {
 *                         type uint64;
 *                     }
 *                     leaf s-num-network-error-drops {
 *                         type uint64;
 *                     }
 *                     leaf c-num-network-error-drops {
 *                         type uint64;
 *                     }
 *                     leaf s-num-network-error-drops-rnc-internal {
 *                         type uint64;
 *                     }
 *                     leaf c-num-network-error-drops-rnc-internal {
 *                         type uint64;
 *                     }
 *                     leaf s-num-network-error-drops-rnc-external {
 *                         type uint64;
 *                     }
 *                     leaf c-num-network-error-drops-rnc-external {
 *                         type uint64;
 *                     }
 *                     leaf s-num-network-error-drops-a10-setup-fail {
 *                         type uint64;
 *                     }
 *                     leaf c-num-network-error-drops-a10-setup-fail {
 *                         type uint64;
 *                     }
 *                     leaf s-num-misc-drops-sector-down {
 *                         type uint64;
 *                     }
 *                     leaf c-num-misc-drops-sector-down {
 *                         type uint64;
 *                     }
 *                     leaf s-num-misc-drops-internal-error {
 *                         type uint64;
 *                     }
 *                     leaf c-num-misc-drops-internal-error {
 *                         type uint64;
 *                     }
 *                     leaf c-num-misc-drops-state-mismatch {
 *                         type uint64;
 *                     }
 *                     leaf s-num-misc-drops-state-mismatch {
 *                         type uint64;
 *                     }
 *                     leaf s-num-misc-drops-due-to-rlp {
 *                         type uint64;
 *                     }
 *                     leaf c-num-misc-drops-due-to-rlp {
 *                         type uint64;
 *                     }
 *                     uses cdma2000-hrpd-rnc-sig-apps-stats-g;
 *                 }
 *                 container cdma2000-hrpd-access-auth-config {
 *                     leaf a12-access-authentication-enable {
 *                         type int64;
 *                     }
 *                     uses cdma2000-hrpd-access-auth-config-g;
 *                 }
 *                 container cdma2000-hrpd-access-auth-stats {
 *                     leaf an-ppp-authentication-attempts-by-node {
 *                         type uint64;
 *                     }
 *                     leaf a12-requests-sent-from-node {
 *                         type uint64;
 *                     }
 *                     leaf a12-rejects-received-by-node {
 *                         type uint64;
 *                     }
 *                     leaf a12-accepts-received-by-node {
 *                         type uint64;
 *                     }
 *                     leaf a12-access-challenges-received-by-node {
 *                         type uint64;
 *                     }
 *                     leaf a12-retransmits-sent-from-node {
 *                         type uint64;
 *                     }
 *                     leaf a12-timeouts-events-for-node {
 *                         type uint64;
 *                     }
 *                     leaf a12-malformedresponse-received-by-node {
 *                         type uint64;
 *                     }
 *                     leaf a12-bad-authenticator-received-by-node {
 *                         type uint64;
 *                     }
 *                     leaf a12-unknown-type-received-by-node {
 *                         type uint64;
 *                     }
 *                     leaf a12-unknown-pkt-received-by-node {
 *                         type uint64;
 *                     }
 *                     leaf a12-unknown-server-received-by-node {
 *                         type uint64;
 *                     }
 *                     leaf a12-other-failure-occurences-in-node {
 *                         type uint64;
 *                     }
 *                     leaf a12-by-pass-num-ats-with-unknown-mfr-code-by-node {
 *                         type uint64;
 *                     }
 *                     leaf a12-tx-path-fail-due-to-an-ppp-error-by-node {
 *                         type uint64;
 *                     }
 *                     leaf a12-tx-path-fail-due-to-no-server-available-by-node {
 *                         type uint64;
 *                     }
 *                     leaf a12-tx-path-fail-due-to-internal-error-by-node {
 *                         type uint64;
 *                     }
 *                     leaf a12-tx-path-fail-due-to-no-packet-id-available-by-node {
 *                         type uint64;
 *                     }
 *                     leaf a12-tx-path-fail-due-to-transmit-error-by-node {
 *                         type uint64;
 *                     }
 *                     leaf a12-svr-timeouts-for-node {
 *                         type uint64;
 *                     }
 *                     leaf a12-enh-ta-bypass-lcp-timeout-by-node {
 *                         type uint64;
 *                     }
 *                     leaf a12-enh-ta-bypass-chap-timeout-by-node {
 *                         type uint64;
 *                     }
 *                     leaf a12-enh-ta-bypass-chap-invalid-by-node {
 *                         type uint64;
 *                     }
 *                     leaf a12-enh-ta-bypass-chap-nai-matches-a12-bypass-list-by-node {
 *                         type uint64;
 *                     }
 *                     leaf a12-session-ta-timeout-by-node {
 *                         type uint64;
 *                     }
 *                     leaf access-auth-failed-due-to-session-close-total {
 *                         type uint64;
 *                     }
 *                     leaf access-auth-succeeded {
 *                         type uint64;
 *                     }
 *                     uses cdma2000-hrpd-access-auth-stats-g;
 *                 }
 *                 uses cdma2000-hrpd-g;
 *             }
 *             container cdma2000-beacon {
 *                 leaf beacon-admin-status {
 *                     type enumeration;
 *                 }
 *                 leaf beacon-oper-status {
 *                     type enumeration;
 *                 }
 *                 leaf hrpd-beacon-enable {
 *                     type boolean;
 *                 }
 *                 leaf period {
 *                     type period;
 *                 }
 *                 leaf maxfap-beacon-tx-power {
 *                     type string;
 *                 }
 *                 leaf maxfap-beacon-tx-power-in-use {
 *                     type maxfap-beacon-tx-power-in-use;
 *                 }
 *                 leaf beacon-pch-pwr-percentage {
 *                     type beacon-pch-pwr-percentage;
 *                 }
 *                 leaf max-hrpd-beacon-tx-power {
 *                     type string;
 *                 }
 *                 leaf max-hrpd-beacon-tx-power-in-use {
 *                     type max-hrpd-beacon-tx-power-in-use;
 *                 }
 *                 leaf beacon-pilot-pwr-percentage {
 *                     type beacon-pilot-pwr-percentage;
 *                 }
 *                 leaf beacon-sync-pwr-percentage {
 *                     type beacon-sync-pwr-percentage;
 *                 }
 *                 leaf max-beacon-list-entries {
 *                     type uint64;
 *                 }
 *                 leaf beacon-list-number-of-entries {
 *                     type uint64;
 *                 }
 *                 leaf max-hrpd-beacon-list-entries {
 *                     type uint64;
 *                 }
 *                 leaf hrpd-beacon-list-number-of-entries {
 *                     type uint64;
 *                 }
 *                 list cdma2000-beacon-beacon-list {
 *                     key "beacon-index";
 *                     leaf enable {
 *                         type boolean;
 *                     }
 *                     leaf alias {
 *                         type string;
 *                     }
 *                     leaf beacon-index {
 *                         type int64;
 *                     }
 *                     leaf offset {
 *                         type uint16;
 *                     }
 *                     leaf duration {
 *                         type duration;
 *                     }
 *                     leaf transmission-format {
 *                         type enumeration;
 *                     }
 *                     leaf beacon-band-class {
 *                         type int64;
 *                     }
 *                     leaf beacon-channel-freq {
 *                         type uint16;
 *                     }
 *                     leaf-list beacon-pn-offset {
 *                         type string;
 *                     }
 *                     leaf tx-power {
 *                         type tx-power;
 *                     }
 *                     leaf beacon-sid {
 *                         type uint16;
 *                     }
 *                     leaf beacon-nid {
 *                         type uint16;
 *                     }
 *                     leaf beacon-pzid {
 *                         type uint64;
 *                     }
 *                     uses cdma2000-beacon-beacon-list-g;
 *                 }
 *                 list cdma2000-beacon-hrpd-beacon-list {
 *                     key "beacon-index";
 *                     leaf enable {
 *                         type boolean;
 *                     }
 *                     leaf alias {
 *                         type string;
 *                     }
 *                     leaf beacon-index {
 *                         type int64;
 *                     }
 *                     leaf c-coffset {
 *                         type uint16;
 *                     }
 *                     leaf offset {
 *                         type int64;
 *                     }
 *                     leaf duration {
 *                         type uint16;
 *                     }
 *                     leaf num-c-ccycles {
 *                         type uint8;
 *                     }
 *                     leaf beacon-band-class {
 *                         type uint8;
 *                     }
 *                     leaf beacon-channel-freq {
 *                         type uint16;
 *                     }
 *                     leaf-list beacon-pn-offset {
 *                         type string;
 *                     }
 *                     leaf tx-power {
 *                         type tx-power;
 *                     }
 *                     uses cdma2000-beacon-hrpd-beacon-list-g;
 *                 }
 *                 uses cdma2000-beacon-g;
 *             }
 *             uses cdma2000-g;
 *         }
 *         uses cell-config-g;
 *     }
 *     container rem {
 *         container rem-umts {
 *             container rem-umts-wcdma {
 *                 leaf in-service-handling {
 *                     type in-service-handling;
 *                 }
 *                 leaf scan-on-boot {
 *                     type scan-on-boot;
 *                 }
 *                 leaf scan-periodically {
 *                     type scan-periodically;
 *                 }
 *                 leaf periodic-interval {
 *                     type periodic-interval;
 *                 }
 *                 leaf periodic-time {
 *                     type date-and-time;
 *                 }
 *                 leaf-list remplmn-list {
 *                     type string;
 *                 }
 *                 leaf-list rem-band-list {
 *                     type string;
 *                 }
 *                 leaf-list uarfcndl-list {
 *                     type string;
 *                 }
 *                 leaf scan-timeout {
 *                     type scan-timeout;
 *                 }
 *                 leaf scan-status {
 *                     type enumeration;
 *                 }
 *                 leaf error-details {
 *                     type string;
 *                 }
 *                 leaf last-scan-time {
 *                     type date-and-time;
 *                 }
 *                 leaf max-cell-entries {
 *                     type uint64;
 *                 }
 *                 leaf cell-number-of-entries {
 *                     type uint64;
 *                 }
 *                 list rem-umts-wcdma-cell {
 *                     key "rem-umts-wcdma-cell-key";
 *                     leaf rem-umts-wcdma-cell-key {
 *                         type string;
 *                     }
 *                     container rem-umts-wcdma-cell-rf {
 *                         leaf uarfcndl {
 *                             type uint16;
 *                         }
 *                         leaf cpichrscp {
 *                             type cpichrscp;
 *                         }
 *                         leaf cpich-ec-no {
 *                             type cpich-ec-no;
 *                         }
 *                         leaf rssi {
 *                             type rssi;
 *                         }
 *                         leaf primary-scrambling-code {
 *                             type uint16;
 *                         }
 *                         uses rem-umts-wcdma-cell-rf-g;
 *                     }
 *                     container rem-umts-wcdma-cell-bcch {
 *                         leaf plmn-type {
 *                             type enumeration;
 *                         }
 *                         leaf plmnid {
 *                             type string;
 *                         }
 *                         leaf lac {
 *                             type uint16;
 *                         }
 *                         leaf rac {
 *                             type uint8;
 *                         }
 *                         leaf cell-id {
 *                             type uint32;
 *                         }
 *                         leaf pcpich-tx-power {
 *                             type int64;
 *                         }
 *                         leaf csg-indicator {
 *                             type boolean;
 *                         }
 *                         leaf csgid {
 *                             type uint32;
 *                         }
 *                         leaf-list uarfcndl-list {
 *                             type uint16;
 *                         }
 *                         container rem-umts-wcdma-cell-bcch-csgpsc-split-info {
 *                             leaf start-psc-range1-coefficient {
 *                                 type uint8;
 *                             }
 *                             leaf number-of-ps-cs {
 *                                 type enumeration;
 *                             }
 *                             leaf psc-range2-offset {
 *                                 type uint8;
 *                             }
 *                             uses rem-umts-wcdma-cell-bcch-csgpsc-split-info-g;
 *                         }
 *                         container rem-umts-wcdma-cell-bcch-reference-position {
 *                             leaf latitude {
 *                                 type int64;
 *                             }
 *                             leaf longitude {
 *                                 type int64;
 *                             }
 *                             leaf uncertainty-semi-major {
 *                                 type uint8;
 *                             }
 *                             leaf uncertainty-semi-minor {
 *                                 type uint8;
 *                             }
 *                             leaf orientation-of-major-axis {
 *                                 type uint8;
 *                             }
 *                             leaf confidence {
 *                                 type confidence;
 *                             }
 *                             uses rem-umts-wcdma-cell-bcch-reference-position-g;
 *                         }
 *                         uses rem-umts-wcdma-cell-bcch-g;
 *                     }
 *                     uses rem-umts-wcdma-cell-g;
 *                 }
 *                 uses rem-umts-wcdma-g;
 *             }
 *             container rem-umts-gsm {
 *                 leaf in-service-handling {
 *                     type in-service-handling;
 *                 }
 *                 leaf scan-on-boot {
 *                     type scan-on-boot;
 *                 }
 *                 leaf scan-periodically {
 *                     type scan-periodically;
 *                 }
 *                 leaf periodic-interval {
 *                     type periodic-interval;
 *                 }
 *                 leaf periodic-time {
 *                     type date-and-time;
 *                 }
 *                 leaf-list remplmn-list {
 *                     type string;
 *                 }
 *                 leaf-list rem-band-list {
 *                     type enumeration;
 *                 }
 *                 leaf-list arfcn-list {
 *                     type string;
 *                 }
 *                 leaf scan-timeout {
 *                     type scan-timeout;
 *                 }
 *                 leaf scan-status {
 *                     type enumeration;
 *                 }
 *                 leaf error-details {
 *                     type string;
 *                 }
 *                 leaf last-scan-time {
 *                     type date-and-time;
 *                 }
 *                 leaf max-cell-entries {
 *                     type uint64;
 *                 }
 *                 leaf cell-number-of-entries {
 *                     type uint64;
 *                 }
 *                 list rem-umts-gsm-cell {
 *                     key "arfcn" "bsic";
 *                     leaf band-indicator {
 *                         type enumeration;
 *                     }
 *                     leaf arfcn {
 *                         type uint16;
 *                     }
 *                     leaf bsic {
 *                         type uint8;
 *                     }
 *                     leaf plmnid {
 *                         type string;
 *                     }
 *                     leaf lac {
 *                         type uint16;
 *                     }
 *                     leaf rac {
 *                         type uint8;
 *                     }
 *                     leaf ci {
 *                         type uint16;
 *                     }
 *                     leaf rssi {
 *                         type rssi;
 *                     }
 *                     uses rem-umts-gsm-cell-g;
 *                 }
 *                 uses rem-umts-gsm-g;
 *             }
 *             uses rem-umts-g;
 *         }
 *         container rem-lte {
 *             leaf in-service-handling {
 *                 type in-service-handling;
 *             }
 *             leaf scan-on-boot {
 *                 type scan-on-boot;
 *             }
 *             leaf scan-periodically {
 *                 type scan-periodically;
 *             }
 *             leaf periodic-interval {
 *                 type periodic-interval;
 *             }
 *             leaf periodic-time {
 *                 type date-and-time;
 *             }
 *             leaf-list remplmn-list {
 *                 type string;
 *             }
 *             leaf-list rem-band-list {
 *                 type string;
 *             }
 *             leaf-list eutra-carrier-arfcndl-list {
 *                 type string;
 *             }
 *             leaf scan-timeout {
 *                 type scan-timeout;
 *             }
 *             leaf scan-status {
 *                 type enumeration;
 *             }
 *             leaf error-details {
 *                 type string;
 *             }
 *             leaf last-scan-time {
 *                 type date-and-time;
 *             }
 *             leaf max-cell-entries {
 *                 type uint64;
 *             }
 *             leaf cell-number-of-entries {
 *                 type uint64;
 *             }
 *             leaf max-carrier-meas-entries {
 *                 type uint64;
 *             }
 *             leaf carrier-meas-number-of-entries {
 *                 type uint64;
 *             }
 *             list rem-lte-cell {
 *                 key "rem-lte-cell-key";
 *                 leaf rem-lte-cell-key {
 *                     type string;
 *                 }
 *                 container rem-lte-cell-rf {
 *                     leaf eutra-carrier-arfcn {
 *                         type uint16;
 *                     }
 *                     leaf phy-cell-id {
 *                         type uint16;
 *                     }
 *                     leaf rsrp {
 *                         type rsrp;
 *                     }
 *                     leaf rsrq {
 *                         type rsrq;
 *                     }
 *                     leaf rssi {
 *                         type rssi;
 *                     }
 *                     uses rem-lte-cell-rf-g;
 *                 }
 *                 container rem-lte-cell-bcch {
 *                     leaf dl-bandwidth {
 *                         type dl-bandwidth;
 *                     }
 *                     leaf ul-bandwidth {
 *                         type ul-bandwidth;
 *                     }
 *                     leaf rs-tx-power {
 *                         type rs-tx-power;
 *                     }
 *                     leaf tac {
 *                         type uint16;
 *                     }
 *                     leaf cell-id {
 *                         type uint32;
 *                     }
 *                     leaf cell-barred {
 *                         type boolean;
 *                     }
 *                     leaf csg-indication {
 *                         type boolean;
 *                     }
 *                     leaf csg-identity {
 *                         type uint32;
 *                     }
 *                     leaf max-plmn-list-entries {
 *                         type uint64;
 *                     }
 *                     leaf plmn-list-number-of-entries {
 *                         type uint64;
 *                     }
 *                     list rem-lte-cell-bcch-plmn-list {
 *                         key "plmnid";
 *                         leaf plmnid {
 *                             type string;
 *                         }
 *                         leaf cell-reserved-for-operator-use {
 *                             type boolean;
 *                         }
 *                         uses rem-lte-cell-bcch-plmn-list-g;
 *                     }
 *                     uses rem-lte-cell-bcch-g;
 *                 }
 *                 uses rem-lte-cell-g;
 *             }
 *             list rem-lte-carrier-meas {
 *                 key "carrier-arfcndl" "carrier-ch-width";
 *                 leaf enable {
 *                     type boolean;
 *                 }
 *                 leaf alias {
 *                     type string;
 *                 }
 *                 leaf carrier-arfcndl {
 *                     type carrier-arfcndl;
 *                 }
 *                 leaf carrier-ch-width {
 *                     type carrier-ch-width;
 *                 }
 *                 leaf carrier-rssi {
 *                     type carrier-rssi;
 *                 }
 *                 uses rem-lte-carrier-meas-g;
 *             }
 *             uses rem-lte-g;
 *         }
 *         container rem-cdma2000 {
 *             leaf in-service-handling {
 *                 type enumeration;
 *             }
 *             leaf scan-on-boot {
 *                 type boolean;
 *             }
 *             leaf scan-now {
 *                 type boolean;
 *             }
 *             leaf return-timer {
 *                 type return-timer;
 *             }
 *             leaf scan-periodically {
 *                 type boolean;
 *             }
 *             leaf periodic-interval {
 *                 type periodic-interval;
 *             }
 *             leaf periodic-time {
 *                 type date-and-time;
 *             }
 *             leaf report-overheads {
 *                 type enumeration;
 *             }
 *             leaf scan-timeout {
 *                 type scan-timeout;
 *             }
 *             leaf scan-status {
 *                 type enumeration;
 *             }
 *             leaf error-details {
 *                 type string;
 *             }
 *             leaf last-scan-time {
 *                 type date-and-time;
 *             }
 *             container rem-cdma2000-one-x {
 *                 leaf max-cell-entries {
 *                     type uint64;
 *                 }
 *                 leaf cell-number-of-entries {
 *                     type uint64;
 *                 }
 *                 leaf max-channel-entries {
 *                     type uint64;
 *                 }
 *                 leaf channel-number-of-entries {
 *                     type uint64;
 *                 }
 *                 list rem-cdma2000-one-x-channel {
 *                     key "sniffing-band-class" "sniffing-channel-number";
 *                     leaf enable {
 *                         type boolean;
 *                     }
 *                     leaf alias {
 *                         type string;
 *                     }
 *                     leaf sniffing-band-class {
 *                         type uint8;
 *                     }
 *                     leaf sniffing-channel-number {
 *                         type uint16;
 *                     }
 *                     leaf-list pn-list {
 *                         type string;
 *                     }
 *                     uses rem-cdma2000-one-x-channel-g;
 *                 }
 *                 list rem-cdma2000-one-x-cell {
 *                     key "rem-cdma2000-one-x-cell-key";
 *                     leaf rem-cdma2000-one-x-cell-key {
 *                         type string;
 *                     }
 *                     container rem-cdma2000-one-x-cell-rf {
 *                         leaf band {
 *                             type int64;
 *                         }
 *                         leaf rfcnfl {
 *                             type uint16;
 *                         }
 *                         leaf io {
 *                             type io;
 *                         }
 *                         leaf p-ilot-pn {
 *                             type p-ilot-pn;
 *                         }
 *                         leaf p-ilot-pn-phase {
 *                             type p-ilot-pn-phase;
 *                         }
 *                         leaf pilot-strength-ecp {
 *                             type pilot-strength-ecp;
 *                         }
 *                         leaf pilot-strength-ecp-io {
 *                             type pilot-strength-ecp-io;
 *                         }
 *                         leaf overheads-available {
 *                             type boolean;
 *                         }
 *                         uses rem-cdma2000-one-x-cell-rf-g;
 *                     }
 *                     container rem-cdma2000-one-x-cell-control-channel {
 *                         leaf sid {
 *                             type int64;
 *                         }
 *                         leaf nid {
 *                             type int64;
 *                         }
 *                         leaf regzone {
 *                             type int64;
 *                         }
 *                         leaf baselat {
 *                             type int64;
 *                         }
 *                         leaf baselong {
 *                             type int64;
 *                         }
 *                         leaf mcc {
 *                             type int64;
 *                         }
 *                         leaf mncimsi1112 {
 *                             type int64;
 *                         }
 *                         leaf baseid {
 *                             type int64;
 *                         }
 *                         leaf apid {
 *                             type string;
 *                         }
 *                         leaf apidmask {
 *                             type int64;
 *                         }
 *                         leaf apidtext {
 *                             type string;
 *                         }
 *                         uses rem-cdma2000-one-x-cell-control-channel-g;
 *                     }
 *                     uses rem-cdma2000-one-x-cell-g;
 *                 }
 *                 uses rem-cdma2000-one-x-g;
 *             }
 *             container rem-cdma2000-hrpd {
 *                 leaf max-cell-entries {
 *                     type uint64;
 *                 }
 *                 leaf cell-number-of-entries {
 *                     type uint64;
 *                 }
 *                 leaf max-channel-entries {
 *                     type uint64;
 *                 }
 *                 leaf channel-number-of-entries {
 *                     type uint64;
 *                 }
 *                 list rem-cdma2000-hrpd-channel {
 *                     key "sniffing-band-class" "sniffing-channel-number";
 *                     leaf enable {
 *                         type boolean;
 *                     }
 *                     leaf alias {
 *                         type string;
 *                     }
 *                     leaf sniffing-band-class {
 *                         type uint8;
 *                     }
 *                     leaf sniffing-channel-number {
 *                         type uint16;
 *                     }
 *                     leaf-list pn-list {
 *                         type string;
 *                     }
 *                     uses rem-cdma2000-hrpd-channel-g;
 *                 }
 *                 list rem-cdma2000-hrpd-cell {
 *                     key "rem-cdma2000-hrpd-cell-key";
 *                     leaf rem-cdma2000-hrpd-cell-key {
 *                         type string;
 *                     }
 *                     container rem-cdma2000-hrpd-cell-rf {
 *                         leaf band {
 *                             type int64;
 *                         }
 *                         leaf rfcnfl {
 *                             type uint16;
 *                         }
 *                         leaf io {
 *                             type io;
 *                         }
 *                         leaf p-ilot-pn {
 *                             type p-ilot-pn;
 *                         }
 *                         leaf p-ilot-pn-phase {
 *                             type p-ilot-pn-phase;
 *                         }
 *                         leaf pilot-strength-ecp {
 *                             type pilot-strength-ecp;
 *                         }
 *                         leaf pilot-strength-ecp-io {
 *                             type pilot-strength-ecp-io;
 *                         }
 *                         leaf overheads-available {
 *                             type boolean;
 *                         }
 *                         uses rem-cdma2000-hrpd-cell-rf-g;
 *                     }
 *                     container rem-cdma2000-hrpd-cell-control-channel {
 *                         leaf color-code {
 *                             type int64;
 *                         }
 *                         leaf sector-id {
 *                             type binary;
 *                         }
 *                         leaf subnet-mask {
 *                             type subnet-mask;
 *                         }
 *                         leaf country-code {
 *                             type int64;
 *                         }
 *                         leaf latitude {
 *                             type latitude;
 *                         }
 *                         leaf longitude {
 *                             type longitude;
 *                         }
 *                         uses rem-cdma2000-hrpd-cell-control-channel-g;
 *                     }
 *                     uses rem-cdma2000-hrpd-cell-g;
 *                 }
 *                 uses rem-cdma2000-hrpd-g;
 *             }
 *             container rem-cdma2000-macro-timing {
 *                 leaf admin-state {
 *                     type uint8;
 *                 }
 *                 leaf tracking-channel-number {
 *                     type uint64;
 *                 }
 *                 leaf tracking-band-class {
 *                     type uint8;
 *                 }
 *                 leaf-list tracking-pn-offset {
 *                     type string;
 *                 }
 *                 leaf timing-source {
 *                     type uint8;
 *                 }
 *                 leaf channel-number-of-entries {
 *                     type uint64;
 *                 }
 *                 list rem-cdma2000-macro-timing-channel {
 *                     key "band-class" "channel-number";
 *                     leaf enable {
 *                         type boolean;
 *                     }
 *                     leaf alias {
 *                         type string;
 *                     }
 *                     leaf air-interface-type {
 *                         type uint8;
 *                     }
 *                     leaf band-class {
 *                         type uint8;
 *                     }
 *                     leaf channel-number {
 *                         type uint64;
 *                     }
 *                     leaf priority {
 *                         type uint64;
 *                     }
 *                     leaf-list pn-list {
 *                         type string;
 *                     }
 *                     uses rem-cdma2000-macro-timing-channel-g;
 *                 }
 *                 uses rem-cdma2000-macro-timing-g;
 *             }
 *             uses rem-cdma2000-g;
 *         }
 *         uses rem-g;
 *     }
 *     container transport {
 *         container transport-sip {
 *             leaf enable {
 *                 type boolean;
 *             }
 *             container transport-sip-fcs {
 *                 leaf fcsuri {
 *                     type string;
 *                 }
 *                 leaf out-going-proxy-uri {
 *                     type string;
 *                 }
 *                 leaf p-access-net-info-header {
 *                     type string;
 *                 }
 *                 leaf realm {
 *                     type string;
 *                 }
 *                 leaf impu {
 *                     type string;
 *                 }
 *                 leaf impi {
 *                     type string;
 *                 }
 *                 leaf sip-password {
 *                     type string;
 *                 }
 *                 leaf-list sip-auth-capability {
 *                     type enumeration;
 *                 }
 *                 leaf sip-auth-method {
 *                     type string;
 *                 }
 *                 leaf sip-local-port {
 *                     type uint16;
 *                 }
 *                 leaf rtp-port-low-limit {
 *                     type uint16;
 *                 }
 *                 leaf rtp-port-high-limit {
 *                     type uint16;
 *                 }
 *                 leaf sip-reg-expiry {
 *                     type uint64;
 *                 }
 *                 leaf sip-session-expiry {
 *                     type sip-session-expiry;
 *                 }
 *                 leaf-list emergency-numbers-list {
 *                     type string;
 *                 }
 *                 leaf timer-t1 {
 *                     type timer-t1;
 *                 }
 *                 leaf timer-t2 {
 *                     type timer-t2;
 *                 }
 *                 leaf timer-t4 {
 *                     type timer-t4;
 *                 }
 *                 leaf t3210 {
 *                     type t3210;
 *                 }
 *                 uses transport-sip-fcs-g;
 *             }
 *             uses transport-sip-g;
 *         }
 *         container transport-sctp {
 *             leaf enable {
 *                 type boolean;
 *             }
 *             leaf hb-interval {
 *                 type hb-interval;
 *             }
 *             leaf max-association-retransmits {
 *                 type max-association-retransmits;
 *             }
 *             leaf max-init-retransmits {
 *                 type max-init-retransmits;
 *             }
 *             leaf max-path-retransmits {
 *                 type max-path-retransmits;
 *             }
 *             leaf rto-initial {
 *                 type rto-initial;
 *             }
 *             leaf rto-max {
 *                 type rto-max;
 *             }
 *             leaf rto-min {
 *                 type rto-min;
 *             }
 *             leaf val-cookie-life {
 *                 type val-cookie-life;
 *             }
 *             leaf out-of-blues {
 *                 type uint64;
 *             }
 *             leaf checksum-errors {
 *                 type uint64;
 *             }
 *             leaf out-ctrl-chunks {
 *                 type uint64;
 *             }
 *             leaf out-order-chunks {
 *                 type uint64;
 *             }
 *             leaf out-unorder-chunks {
 *                 type uint64;
 *             }
 *             leaf in-ctrl-chunks {
 *                 type uint64;
 *             }
 *             leaf in-order-chunks {
 *                 type uint64;
 *             }
 *             leaf in-unorder-chunks {
 *                 type uint64;
 *             }
 *             leaf frag-usr-msgs {
 *                 type uint64;
 *             }
 *             leaf reasm-usr-msgs {
 *                 type uint64;
 *             }
 *             leaf out-sctp-packs {
 *                 type uint64;
 *             }
 *             leaf in-sctp-packs {
 *                 type uint64;
 *             }
 *             leaf discontinuity {
 *                 type date-and-time;
 *             }
 *             leaf assoc-number-of-entries {
 *                 type uint64;
 *             }
 *             list transport-sctp-assoc {
 *                 key "primary-peer-address" "local-port";
 *                 leaf status {
 *                     type enumeration;
 *                 }
 *                 leaf primary-peer-address {
 *                     type ip-address;
 *                 }
 *                 leaf local-port {
 *                     type uint16;
 *                 }
 *                 leaf in-streams {
 *                     type uint64;
 *                 }
 *                 leaf out-streams {
 *                     type uint64;
 *                 }
 *                 leaf start-time {
 *                     type date-and-time;
 *                 }
 *                 leaf discontinuity {
 *                     type date-and-time;
 *                 }
 *                 uses transport-sctp-assoc-g;
 *             }
 *             uses transport-sctp-g;
 *         }
 *         container transport-real-time {
 *             leaf rtcp-enable {
 *                 type boolean;
 *             }
 *             leaf sent-packets {
 *                 type uint64;
 *             }
 *             leaf rcv-packets {
 *                 type uint64;
 *             }
 *             leaf bytes-sent {
 *                 type uint64;
 *             }
 *             leaf bytes-received {
 *                 type uint64;
 *             }
 *             container transport-real-time-perf {
 *                 leaf lost-rcv-packets {
 *                     type uint64;
 *                 }
 *                 leaf lost-far-end-packets {
 *                     type uint64;
 *                 }
 *                 leaf overruns {
 *                     type uint64;
 *                 }
 *                 leaf underruns {
 *                     type uint64;
 *                 }
 *                 leaf mean-rtt {
 *                     type mean-rtt;
 *                 }
 *                 leaf max-rtt {
 *                     type max-rtt;
 *                 }
 *                 leaf mean-receive-jitter {
 *                     type mean-receive-jitter;
 *                 }
 *                 leaf max-receive-jitter {
 *                     type max-receive-jitter;
 *                 }
 *                 leaf mean-far-end-jitter {
 *                     type mean-far-end-jitter;
 *                 }
 *                 leaf max-far-end-jitter {
 *                     type max-far-end-jitter;
 *                 }
 *                 uses transport-real-time-perf-g;
 *             }
 *             uses transport-real-time-g;
 *         }
 *         container transport-packet {
 *             leaf echo-interval {
 *                 type echo-interval;
 *             }
 *             leaf sent-packets {
 *                 type uint64;
 *             }
 *             leaf rcv-packets {
 *                 type uint64;
 *             }
 *             uses transport-packet-g;
 *         }
 *         container transport-security {
 *             leaf secret-number-of-entries {
 *                 type uint64;
 *             }
 *             list transport-security-secret {
 *                 key "uicc-card-id";
 *                 leaf enable {
 *                     type boolean;
 *                 }
 *                 leaf type {
 *                     type enumeration;
 *                 }
 *                 leaf status {
 *                     type enumeration;
 *                 }
 *                 leaf uicc-card-id {
 *                     type string;
 *                 }
 *                 uses transport-security-secret-g;
 *             }
 *             uses transport-security-g;
 *         }
 *         uses transport-g;
 *     }
 *     uses fap-service-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service</i>
 *
 * <p>To create instances of this class use {@link FapServiceBuilder}.
 * @see FapServiceBuilder
 * @see FapServiceKey
 *
 */
public interface FapService
    extends
    ChildOf<BbfTr196203FullData>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapService>,
    FapServiceG,
    Identifiable<FapServiceKey>
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "fap-service").intern();

    /**
     * Container for object class FAPService.{i}.Capabilities.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Capabilities</code> <code>capabilities</code>, or <code>null</code> if not present
     */
    Capabilities getCapabilities();
    
    /**
     * Container for object class FAPService.{i}.FAPControl.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.FapControl</code> <code>fapControl</code>, or <code>null</code> if not present
     */
    FapControl getFapControl();
    
    /**
     * Container for object class FAPService.{i}.AccessMgmt.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.AccessMgmt</code> <code>accessMgmt</code>, or <code>null</code> if not present
     */
    AccessMgmt getAccessMgmt();
    
    /**
     * Container for object class FAPService.{i}.CellConfig.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.CellConfig</code> <code>cellConfig</code>, or <code>null</code> if not present
     */
    CellConfig getCellConfig();
    
    /**
     * Container for object class FAPService.{i}.REM.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Rem</code> <code>rem</code>, or <code>null</code> if not present
     */
    Rem getRem();
    
    /**
     * Container for object class FAPService.{i}.Transport.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.Transport</code> <code>transport</code>, or <code>null</code> if not present
     */
    Transport getTransport();
    
    /**
     * Returns Primary Key of Yang List Type
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.FapServiceKey</code> <code>key</code>, or <code>null</code> if not present
     */
    FapServiceKey getKey();

}

