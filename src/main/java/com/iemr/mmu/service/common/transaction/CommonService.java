package com.iemr.mmu.service.common.transaction;

public interface CommonService {

	public String getBenSymptomaticQuestionnaireDetailsData(Long beneficiaryRegID) throws Exception;

	public String getBenPreviousDiabetesData(Long beneficiaryRegID) throws Exception;

	public String getBenPreviousReferralData(Long beneficiaryRegID) throws Exception;
}
