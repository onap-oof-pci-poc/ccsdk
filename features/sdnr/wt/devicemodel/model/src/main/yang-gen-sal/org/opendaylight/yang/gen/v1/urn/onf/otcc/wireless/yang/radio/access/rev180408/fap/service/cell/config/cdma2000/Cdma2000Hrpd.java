package org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdRncSigAppsStats;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdRedirect;
import org.opendaylight.yangtools.yang.common.QName;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdRan;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdQoSStats;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdAccessAuthStats;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.Cdma2000HrpdG;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdPcfpdsn;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdAccessAuthConfig;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdPcfConfig;
import java.util.List;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdBatchPcfpdsn;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdCallControlStats;
import org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.Cdma2000;

/**
 * Container for object class FAPService.{i}.CellConfig.CDMA2000.HRPD.
 *
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>bbf-tr-196-2-0-3-full</b>
 * <pre>
 * container cdma2000-hrpd {
 *     leaf pcfpdsn-number-of-entries {
 *         type uint64;
 *     }
 *     leaf max-batch-pcfpdsn-entries {
 *         type uint64;
 *     }
 *     leaf batch-pcfpdsn-number-of-entries {
 *         type uint64;
 *     }
 *     container cdma2000-hrpd-ran {
 *         container cdma2000-hrpd-ran-rf {
 *             leaf hrpd-car-band-class {
 *                 type uint8;
 *             }
 *             leaf-list rfcnfl {
 *                 type string;
 *             }
 *             leaf rfcnfl-in-use {
 *                 type uint64;
 *             }
 *             leaf-list pilot-pn {
 *                 type string;
 *             }
 *             leaf pilot-pn-in-use {
 *                 type uint64;
 *             }
 *             leaf maxfap-tx-power {
 *                 type string;
 *             }
 *             leaf maxfap-tx-power-in-use {
 *                 type maxfap-tx-power-in-use;
 *             }
 *             leaf control-channel-rate {
 *                 type int64;
 *             }
 *             leaf sync-capsule-offset {
 *                 type int64;
 *             }
 *             leaf rab-length {
 *                 type int64;
 *             }
 *             leaf rab-offset {
 *                 type int64;
 *             }
 *             leaf sector-id {
 *                 type binary;
 *             }
 *             leaf color-code {
 *                 type int64;
 *             }
 *             leaf subnet-mask-length {
 *                 type subnet-mask-length;
 *             }
 *             leaf hrpd-sec-el-reverse-link-silence-duration {
 *                 type hrpd-sec-el-reverse-link-silence-duration;
 *             }
 *             leaf hrpd-sec-el-reverse-link-silence-period {
 *                 type hrpd-sec-el-reverse-link-silence-period;
 *             }
 *             leaf open-loop-adjust {
 *                 type open-loop-adjust;
 *             }
 *             leaf probe-initial-adjust {
 *                 type probe-initial-adjust;
 *             }
 *             leaf probe-num-steps {
 *                 type int64;
 *             }
 *             leaf probe-power-step {
 *                 type probe-power-step;
 *             }
 *             leaf a-persistence {
 *                 type string;
 *             }
 *             leaf rssirab-threshold {
 *                 type rssirab-threshold;
 *             }
 *             leaf load-rab-threshold {
 *                 type load-rab-threshold;
 *             }
 *             leaf connection-rate-limit {
 *                 type uint8;
 *             }
 *             leaf rfe-rl-balance-ratio {
 *                 type uint8;
 *             }
 *             uses cdma2000-hrpd-ran-rf-g;
 *         }
 *         uses cdma2000-hrpd-ran-g;
 *     }
 *     container cdma2000-hrpd-pcf-config {
 *         leaf pcfpdsn-health-monitor-interval {
 *             type pcfpdsn-health-monitor-interval;
 *         }
 *         container cdma2000-hrpd-pcf-config-pcf-performance-stats {
 *             leaf a10-setup-failure-no-reason {
 *                 type uint64;
 *             }
 *             leaf a10-setup-failure-admin-prohibit {
 *                 type uint64;
 *             }
 *             leaf a10-setup-failure-insuff-resources {
 *                 type uint64;
 *             }
 *             leaf a10-setup-failure-failed-auth {
 *                 type uint64;
 *             }
 *             leaf a10-setup-failure-id-mismatch {
 *                 type uint64;
 *             }
 *             leaf a10-setup-failure-malformed-req {
 *                 type uint64;
 *             }
 *             leaf a10-setup-failure-unknown-pdsn {
 *                 type uint64;
 *             }
 *             leaf a10-setup-failure-unsupp-vend-id {
 *                 type uint64;
 *             }
 *             leaf total-a10-closed-by-rnc {
 *                 type uint64;
 *             }
 *             leaf total-a10-closed-by-pdsn {
 *                 type uint64;
 *             }
 *             leaf total-a10-success-pages {
 *                 type uint64;
 *             }
 *             leaf total-a10-failed-pages {
 *                 type uint64;
 *             }
 *             leaf total-a10-ingress-bytes {
 *                 type total-a10-ingress-bytes;
 *             }
 *             leaf total-a10-egress-bytes {
 *                 type total-a10-egress-bytes;
 *             }
 *             leaf a10-reg-update-received {
 *                 type uint64;
 *             }
 *             leaf total-a10-dropped-pages {
 *                 type uint64;
 *             }
 *             uses cdma2000-hrpd-pcf-config-pcf-performance-stats-g;
 *         }
 *         uses cdma2000-hrpd-pcf-config-g;
 *     }
 *     list cdma2000-hrpd-batch-pcfpdsn {
 *         key "batch-table-number" "batch-table-security-parameter-index" "batch-table-secret-key";
 *         leaf enable {
 *             type boolean;
 *         }
 *         leaf alias {
 *             type string;
 *         }
 *         leaf batch-table-number {
 *             type int64;
 *         }
 *         leaf batch-table-start-ip-address {
 *             type ip-address;
 *         }
 *         leaf batch-table-end-ip-address {
 *             type ip-address;
 *         }
 *         leaf batch-table-security-parameter-index {
 *             type uint32;
 *         }
 *         leaf batch-table-secret-key {
 *             type binary;
 *         }
 *         leaf batch-table-ios-version {
 *             type enumeration;
 *         }
 *         leaf batch-table-pdsn-admin-status {
 *             type int64;
 *         }
 *         leaf pdsn-type {
 *             type string;
 *         }
 *         uses cdma2000-hrpd-batch-pcfpdsn-g;
 *     }
 *     list cdma2000-hrpd-pcfpdsn {
 *         key "pdsn-number" "security-parameter-index" "security-key";
 *         leaf enable {
 *             type boolean;
 *         }
 *         leaf alias {
 *             type string;
 *         }
 *         leaf pdsn-number {
 *             type int64;
 *         }
 *         leaf security-parameter-index {
 *             type uint32;
 *         }
 *         leaf security-key {
 *             type binary;
 *         }
 *         leaf ios-version {
 *             type enumeration;
 *         }
 *         leaf pds-nadmin-status {
 *             type int64;
 *         }
 *         leaf pdsn-health-status {
 *             type uint8;
 *         }
 *         leaf pdsnip-address {
 *             type ip-address;
 *         }
 *         container cdma2000-hrpd-pcfpdsn-a11-session-update-stats {
 *             leaf pdsn-number-session-update-perf {
 *                 type int64;
 *             }
 *             leaf pdsnip-address-session-update-perf {
 *                 type ip-address;
 *             }
 *             leaf a11-session-update-received-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-session-update-accepted-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-session-update-extended-apipdsn {
 *                 type uint64;
 *             }
 *             leaf a11-session-update-for-unknown-psipdsn {
 *                 type uint64;
 *             }
 *             leaf a11-session-update-denied-id-check-fail-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-session-update-denied-auth-check-fail-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-session-update-denied-reason-unspecified-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-session-update-denied-poorly-formed-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-session-update-denied-session-params-not-updated-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-session-update-denied-qo-s-profile-id-not-supported-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-session-update-denied-insufficient-resources-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-session-update-denied-handoff-in-progress-pdsn {
 *                 type uint64;
 *             }
 *             uses cdma2000-hrpd-pcfpdsn-a11-session-update-stats-g;
 *         }
 *         container cdma2000-hrpd-pcfpdsn-a11-reg-update-stats {
 *             leaf pdsn-number-reg-update-perf {
 *                 type int64;
 *             }
 *             leaf pdsnip-address-reg-update-perf {
 *                 type ip-address;
 *             }
 *             leaf a11-reg-update-received-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-update-id-check-fail-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-update-auth-check-fail-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-update-for-unknown-psipdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-update-unspecified-reason-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-update-ppp-timeout-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-update-registration-timeout-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-update-pdsn-error-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-update-inter-pcf-handoff-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-update-inter-pdsn-handoff-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-update-pdsnoamp-intervention-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-update-accounting-error-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-update-user-failed-authentication-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-update-unknown-cause-code-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-update-without-reason-code-pdsn {
 *                 type uint64;
 *             }
 *             uses cdma2000-hrpd-pcfpdsn-a11-reg-update-stats-g;
 *         }
 *         container cdma2000-hrpd-pcfpdsn-aux-a10-stats {
 *             leaf pdsn-number-aux-a10-perf {
 *                 type int64;
 *             }
 *             leaf pdsnip-address-aux-a10-perf {
 *                 type ip-address;
 *             }
 *             leaf aux-a10-connections-created-in-first-reg-req-pdsn {
 *                 type uint64;
 *             }
 *             leaf aux-a10-connections-created-in-subsequent-reg-req-pdsn {
 *                 type uint64;
 *             }
 *             leaf aux-a10-fwd-ip-flows-created-pdsn {
 *                 type uint64;
 *             }
 *             leaf aux-a10-rev-ip-flows-created-pdsn {
 *                 type uint64;
 *             }
 *             leaf aux-a10-ip-flow-accounting-reg-requests-pdsn {
 *                 type uint64;
 *             }
 *             uses cdma2000-hrpd-pcfpdsn-aux-a10-stats-g;
 *         }
 *         container cdma2000-hrpd-pcfpdsn-pcfpdsn-stats {
 *             leaf a10-setup-attempts-pdsn {
 *                 type uint64;
 *             }
 *             leaf a10-setup-successes-pdsn {
 *                 type uint64;
 *             }
 *             leaf a10-setup-blocks-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-req-denied-id-mismatch-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-req-denied-unknown-pdsnpdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-req-denied-no-reason-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-req-denied-admin-prohibit-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-req-denied-insuff-resources-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-req-denied-failed-auth-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-req-denied-malformed-req-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-req-denied-unsupp-vend-id-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-req-denied-reverse-tunnel-unavailable-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-req-denied-reverse-tunnel-tbit-not-set-pdsn {
 *                 type uint64;
 *             }
 *             leaf a11-reg-req-denied-unknown-error-code-pdsn {
 *                 type uint64;
 *             }
 *             leaf a10-reg-req-for-registration-retransmissions-pdsn {
 *                 type uint64;
 *             }
 *             leaf a10-reg-req-for-re-registration-retransmissions-pdsn {
 *                 type uint64;
 *             }
 *             leaf a10-reg-req-for-release-retransmissions-pdsn {
 *                 type uint64;
 *             }
 *             leaf pdsn-number-pdsn-perf {
 *                 type int64;
 *             }
 *             leaf pds-nip-address-pdsn-perf {
 *                 type ip-address;
 *             }
 *             uses cdma2000-hrpd-pcfpdsn-pcfpdsn-stats-g;
 *         }
 *         uses cdma2000-hrpd-pcfpdsn-g;
 *     }
 *     container cdma2000-hrpd-redirect {
 *         leaf redirect-channel-number {
 *             type uint16;
 *         }
 *         leaf redirect-band-class {
 *             type uint8;
 *         }
 *         uses cdma2000-hrpd-redirect-g;
 *     }
 *     container cdma2000-hrpd-call-control-stats {
 *         leaf num-session-setup-attempts {
 *             type uint64;
 *         }
 *         leaf num-session-setup-successful {
 *             type uint64;
 *         }
 *         leaf num-current-sessions-established {
 *             type uint64;
 *         }
 *         leaf num-page-messages-to-at {
 *             type uint64;
 *         }
 *         leaf num-pages-succeeded {
 *             type uint64;
 *         }
 *         leaf num-connections-opened {
 *             type uint64;
 *         }
 *         leaf num-session-setups-failed-to-term-auth {
 *             type uint64;
 *         }
 *         leaf num-forward-rlp-bytes {
 *             type num-forward-rlp-bytes;
 *         }
 *         leaf num-reverse-rlp-bytes {
 *             type num-reverse-rlp-bytes;
 *         }
 *         leaf average-session-setup-time {
 *             type average-session-setup-time;
 *         }
 *         leaf average-page-setup-time {
 *             type uint64;
 *         }
 *         leaf num-conn-setups-aborted {
 *             type uint64;
 *         }
 *         leaf num-forward-pre-rlp-dropped-pkts {
 *             type uint64;
 *         }
 *         uses cdma2000-hrpd-call-control-stats-g;
 *     }
 *     container cdma2000-hrpd-qo-s-stats {
 *         leaf num-qo-s-subscriber-profile-updates-rcvd {
 *             type uint64;
 *         }
 *         leaf num-pdsnip-flow-updates-msg-rcvd {
 *             type uint64;
 *         }
 *         leaf num-pdsnip-flow-updates-msg-failed {
 *             type uint64;
 *         }
 *         leaf num-qo-s-setup-requests-received {
 *             type uint64;
 *         }
 *         leaf num-qo-s-setup-requests-accepted {
 *             type uint64;
 *         }
 *         leaf num-qo-s-setup-requests-rejected {
 *             type uint64;
 *         }
 *         leaf num-reservation-on-requests-received {
 *             type uint64;
 *         }
 *         leaf num-reservation-on-requests-accepted {
 *             type uint64;
 *         }
 *         leaf num-reservation-on-requests-rejected {
 *             type uint64;
 *         }
 *         leaf num-reservation-on-requests-failed {
 *             type uint64;
 *         }
 *         leaf num-fwd-reservation-on-messages-sent {
 *             type uint64;
 *         }
 *         leaf num-rev-reservation-on-messages-sent {
 *             type uint64;
 *         }
 *         leaf num-reservation-off-requests-received {
 *             type uint64;
 *         }
 *         leaf num-reservation-off-requests-accepted {
 *             type uint64;
 *         }
 *         leaf num-reservation-off-requests-rejected {
 *             type uint64;
 *         }
 *         leaf num-fwd-reservation-off-messages-sent {
 *             type uint64;
 *         }
 *         leaf num-rev-reservation-off-messages-sent {
 *             type uint64;
 *         }
 *         leaf num-qo-s-release-requests-received {
 *             type uint64;
 *         }
 *         leaf num-connection-close-initiated-no-ran-rsr {
 *             type uint64;
 *         }
 *         uses cdma2000-hrpd-qo-s-stats-g;
 *     }
 *     container cdma2000-hrpd-rnc-sig-apps-stats {
 *         leaf c-num-page-requests {
 *             type uint64;
 *         }
 *         leaf s-num-page-requests {
 *             type uint64;
 *         }
 *         leaf s-num-connection-setup-attempts {
 *             type uint64;
 *         }
 *         leaf c-num-connection-setup-attempts {
 *             type uint64;
 *         }
 *         leaf s-num-connection-setup-success {
 *             type uint64;
 *         }
 *         leaf c-num-connection-setup-success {
 *             type uint64;
 *         }
 *         leaf s-num-normal-connection-closes {
 *             type uint64;
 *         }
 *         leaf c-num-normal-connection-closes {
 *             type uint64;
 *         }
 *         leaf s-num-total-connection-closes {
 *             type uint64;
 *         }
 *         leaf c-num-total-connection-closes {
 *             type uint64;
 *         }
 *         leaf s-num-rf-related-drops {
 *             type uint64;
 *         }
 *         leaf c-num-rf-related-drops {
 *             type uint64;
 *         }
 *         leaf s-num-page-responses {
 *             type uint64;
 *         }
 *         leaf c-num-page-responses {
 *             type uint64;
 *         }
 *         leaf s-num-rf-related-drops-rtc-lost {
 *             type uint64;
 *         }
 *         leaf c-num-rf-related-drops-rtc-lost {
 *             type uint64;
 *         }
 *         leaf s-num-rf-related-drops-no-ftc {
 *             type uint64;
 *         }
 *         leaf c-num-rf-related-drops-no-ftc {
 *             type uint64;
 *         }
 *         leaf s-num-network-error-drops {
 *             type uint64;
 *         }
 *         leaf c-num-network-error-drops {
 *             type uint64;
 *         }
 *         leaf s-num-network-error-drops-rnc-internal {
 *             type uint64;
 *         }
 *         leaf c-num-network-error-drops-rnc-internal {
 *             type uint64;
 *         }
 *         leaf s-num-network-error-drops-rnc-external {
 *             type uint64;
 *         }
 *         leaf c-num-network-error-drops-rnc-external {
 *             type uint64;
 *         }
 *         leaf s-num-network-error-drops-a10-setup-fail {
 *             type uint64;
 *         }
 *         leaf c-num-network-error-drops-a10-setup-fail {
 *             type uint64;
 *         }
 *         leaf s-num-misc-drops-sector-down {
 *             type uint64;
 *         }
 *         leaf c-num-misc-drops-sector-down {
 *             type uint64;
 *         }
 *         leaf s-num-misc-drops-internal-error {
 *             type uint64;
 *         }
 *         leaf c-num-misc-drops-internal-error {
 *             type uint64;
 *         }
 *         leaf c-num-misc-drops-state-mismatch {
 *             type uint64;
 *         }
 *         leaf s-num-misc-drops-state-mismatch {
 *             type uint64;
 *         }
 *         leaf s-num-misc-drops-due-to-rlp {
 *             type uint64;
 *         }
 *         leaf c-num-misc-drops-due-to-rlp {
 *             type uint64;
 *         }
 *         uses cdma2000-hrpd-rnc-sig-apps-stats-g;
 *     }
 *     container cdma2000-hrpd-access-auth-config {
 *         leaf a12-access-authentication-enable {
 *             type int64;
 *         }
 *         uses cdma2000-hrpd-access-auth-config-g;
 *     }
 *     container cdma2000-hrpd-access-auth-stats {
 *         leaf an-ppp-authentication-attempts-by-node {
 *             type uint64;
 *         }
 *         leaf a12-requests-sent-from-node {
 *             type uint64;
 *         }
 *         leaf a12-rejects-received-by-node {
 *             type uint64;
 *         }
 *         leaf a12-accepts-received-by-node {
 *             type uint64;
 *         }
 *         leaf a12-access-challenges-received-by-node {
 *             type uint64;
 *         }
 *         leaf a12-retransmits-sent-from-node {
 *             type uint64;
 *         }
 *         leaf a12-timeouts-events-for-node {
 *             type uint64;
 *         }
 *         leaf a12-malformedresponse-received-by-node {
 *             type uint64;
 *         }
 *         leaf a12-bad-authenticator-received-by-node {
 *             type uint64;
 *         }
 *         leaf a12-unknown-type-received-by-node {
 *             type uint64;
 *         }
 *         leaf a12-unknown-pkt-received-by-node {
 *             type uint64;
 *         }
 *         leaf a12-unknown-server-received-by-node {
 *             type uint64;
 *         }
 *         leaf a12-other-failure-occurences-in-node {
 *             type uint64;
 *         }
 *         leaf a12-by-pass-num-ats-with-unknown-mfr-code-by-node {
 *             type uint64;
 *         }
 *         leaf a12-tx-path-fail-due-to-an-ppp-error-by-node {
 *             type uint64;
 *         }
 *         leaf a12-tx-path-fail-due-to-no-server-available-by-node {
 *             type uint64;
 *         }
 *         leaf a12-tx-path-fail-due-to-internal-error-by-node {
 *             type uint64;
 *         }
 *         leaf a12-tx-path-fail-due-to-no-packet-id-available-by-node {
 *             type uint64;
 *         }
 *         leaf a12-tx-path-fail-due-to-transmit-error-by-node {
 *             type uint64;
 *         }
 *         leaf a12-svr-timeouts-for-node {
 *             type uint64;
 *         }
 *         leaf a12-enh-ta-bypass-lcp-timeout-by-node {
 *             type uint64;
 *         }
 *         leaf a12-enh-ta-bypass-chap-timeout-by-node {
 *             type uint64;
 *         }
 *         leaf a12-enh-ta-bypass-chap-invalid-by-node {
 *             type uint64;
 *         }
 *         leaf a12-enh-ta-bypass-chap-nai-matches-a12-bypass-list-by-node {
 *             type uint64;
 *         }
 *         leaf a12-session-ta-timeout-by-node {
 *             type uint64;
 *         }
 *         leaf access-auth-failed-due-to-session-close-total {
 *             type uint64;
 *         }
 *         leaf access-auth-succeeded {
 *             type uint64;
 *         }
 *         uses cdma2000-hrpd-access-auth-stats-g;
 *     }
 *     uses cdma2000-hrpd-g;
 * }
 * </pre>The schema path to identify an instance is
 * <i>bbf-tr-196-2-0-3-full/fap-service/cell-config/cdma2000/cdma2000-hrpd</i>
 *
 * <p>To create instances of this class use {@link Cdma2000HrpdBuilder}.
 * @see Cdma2000HrpdBuilder
 *
 */
public interface Cdma2000Hrpd
    extends
    ChildOf<Cdma2000>,
    Augmentable<org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.Cdma2000Hrpd>,
    Cdma2000HrpdG
{



    public static final QName QNAME = org.opendaylight.yangtools.yang.common.QName.create("urn:onf:otcc:wireless:yang:radio-access",
        "2018-04-08", "cdma2000-hrpd").intern();

    /**
     * Container for object class FAPService.{i}.CellConfig.CDMA2000.HRPD.RAN.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdRan</code> <code>cdma2000HrpdRan</code>, or <code>null</code> if not present
     */
    Cdma2000HrpdRan getCdma2000HrpdRan();
    
    /**
     * Container for object class FAPService.{i}.CellConfig.CDMA2000.HRPD.PCFConfig.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdPcfConfig</code> <code>cdma2000HrpdPcfConfig</code>, or <code>null</code> if not present
     */
    Cdma2000HrpdPcfConfig getCdma2000HrpdPcfConfig();
    
    /**
     * List of object class FAPService.{i}.CellConfig.CDMA2000.HRPD.BatchPCFPDSN.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>cdma2000HrpdBatchPcfpdsn</code>, or <code>null</code> if not present
     */
    List<Cdma2000HrpdBatchPcfpdsn> getCdma2000HrpdBatchPcfpdsn();
    
    /**
     * List of object class FAPService.{i}.CellConfig.CDMA2000.HRPD.PCFPDSN.{i}.
     *
     *
     *
     * @return <code>java.util.List</code> <code>cdma2000HrpdPcfpdsn</code>, or <code>null</code> if not present
     */
    List<Cdma2000HrpdPcfpdsn> getCdma2000HrpdPcfpdsn();
    
    /**
     * Container for object class FAPService.{i}.CellConfig.CDMA2000.HRPD.Redirect.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdRedirect</code> <code>cdma2000HrpdRedirect</code>, or <code>null</code> if not present
     */
    Cdma2000HrpdRedirect getCdma2000HrpdRedirect();
    
    /**
     * Container for object class 
     * FAPService.{i}.CellConfig.CDMA2000.HRPD.CallControlStats.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdCallControlStats</code> <code>cdma2000HrpdCallControlStats</code>, or <code>null</code> if not present
     */
    Cdma2000HrpdCallControlStats getCdma2000HrpdCallControlStats();
    
    /**
     * Container for object class FAPService.{i}.CellConfig.CDMA2000.HRPD.QoSStats.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdQoSStats</code> <code>cdma2000HrpdQoSStats</code>, or <code>null</code> if not present
     */
    Cdma2000HrpdQoSStats getCdma2000HrpdQoSStats();
    
    /**
     * Container for object class 
     * FAPService.{i}.CellConfig.CDMA2000.HRPD.RNCSigAppsStats.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdRncSigAppsStats</code> <code>cdma2000HrpdRncSigAppsStats</code>, or <code>null</code> if not present
     */
    Cdma2000HrpdRncSigAppsStats getCdma2000HrpdRncSigAppsStats();
    
    /**
     * Container for object class 
     * FAPService.{i}.CellConfig.CDMA2000.HRPD.AccessAuthConfig.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdAccessAuthConfig</code> <code>cdma2000HrpdAccessAuthConfig</code>, or <code>null</code> if not present
     */
    Cdma2000HrpdAccessAuthConfig getCdma2000HrpdAccessAuthConfig();
    
    /**
     * Container for object class 
     * FAPService.{i}.CellConfig.CDMA2000.HRPD.AccessAuthStats.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.onf.otcc.wireless.yang.radio.access.rev180408.fap.service.cell.config.cdma2000.cdma2000.hrpd.Cdma2000HrpdAccessAuthStats</code> <code>cdma2000HrpdAccessAuthStats</code>, or <code>null</code> if not present
     */
    Cdma2000HrpdAccessAuthStats getCdma2000HrpdAccessAuthStats();

}

