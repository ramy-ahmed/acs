/*******************************************************************************
 * Copyright 2017 General Electric Company
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 *******************************************************************************/

package com.ge.predix.acs.service.policy.evaluation;

import org.springframework.http.ResponseEntity;

import com.ge.predix.acs.rest.PolicyEvaluationRequestV1;
import com.ge.predix.acs.rest.PolicyEvaluationResult;

/**
 * RESTful API interface of the Policy Evaluation API.
 *
 * @author acs-engineers@ge.com
 */
@FunctionalInterface
public interface PolicyEvaluation {

    /**
     * Takes the given access control request and determines if it is allowed or denied, according to the stored
     * policies. It Delegates the policy evaluation to the PolicyEvaluationServices.
     *
     * @param request
     *            Includes the resource url, action and subject to be checked.
     * @return a policy evaluation result with allow or deny
     */
    ResponseEntity<PolicyEvaluationResult> evalPolicyV1(PolicyEvaluationRequestV1 request);

}
