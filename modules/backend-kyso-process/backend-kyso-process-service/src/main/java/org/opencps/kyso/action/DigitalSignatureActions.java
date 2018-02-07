package org.opencps.kyso.action;

import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.model.User;

public interface DigitalSignatureActions {

	public JSONObject createHashSignature(String emailUser, long fileEntryId);

	public JSONObject completeSignature(User user, long id, String sign, String signFieldName, String fileName);
}
