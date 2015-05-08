package com.emergya.spring.security.oauth.google;

import org.springframework.security.oauth2.client.token.grant.code.AuthorizationCodeResourceDetails;

/**
 * This class contains config details for authentication against google oauth services, including custom request parameters.
 *
 * @author lroman
 */
public class GoogleAuthCodeResourceDetails extends AuthorizationCodeResourceDetails {

    private String approvalPrompt = "auto";

    /**
     * @return the approvalPrompt
     */
    public String getApprovalPrompt() {
        return approvalPrompt;
    }

    /**
     * @param approvalPrompt the approvalPrompt to set
     */
    public void setApprovalPrompt(String approvalPrompt) {
        this.approvalPrompt = approvalPrompt;
    }

}
