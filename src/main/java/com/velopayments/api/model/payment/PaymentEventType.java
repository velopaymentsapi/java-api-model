/*
 *
 *  * Copyright 2018 the original author or authors.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */

package com.velopayments.api.model.payment;

public enum  PaymentEventType {
    PAYOUT_SUBMITTED,
    PAYOUT_COMPLETED,
    PAYOUT_INSTRUCTED_V3,
    BANK_PAYMENT_REQUESTED,
    SOURCE_AMOUNT_CONFIRMED,
    PAYMENT_SUBMITTED,
    PAYMENT_SUBMITTED_ACCEPTED,
    PAYMENT_SUBMITTED_REJECTED,
    PAYMENT_CONFIRMED,
    PAYMENT_AWAITING_FUNDS,
    PAYMENT_FUNDED,
    PAYMENT_UNFUNDED,
    PAYMENT_FAILED,
    ACH_SUBMITTED_TO_ODFI,
    PAYMENT_ACCEPTED_BY_RAILS,
    ACH_RETURN_RECEIVED,
    RETURN_PAYMENT_FUNDING_REQUESTED,
    PAYOUT_BATCH_EXECUTED,
    PAYOUT_BATCH_QUOTE_EXPIRED,
    PAYOUT_BATCH_FUNDED,
    PAYOUT_BATCH_FUNDS_RETURN_REQUEST,
    PAYOUT_BATCH_FUNDS_RETURNED,
    PAYOUT_FUNDS_REQUEST,
    PAYOUT_FUNDS_GRANTED,
    PAYOUT_FUNDS_DENIED,
    PAYOUT_BATCH_QUOTED,
    PAYOUT_QUOTED,
    ACH_PAYMENT_RETURN_CANCELLED,
    RETURN_PAYMENT_CANCELLATION_REQUESTED
}
