package cn.wsds.gamemaster.pay.AliPay;import android.text.TextUtils;public class AliPayResult {	private String resultStatus;	private String result;	private String memo;	public AliPayResult(String rawResult) {		if (TextUtils.isEmpty(rawResult))			return;		String[] resultParams = rawResult.split(";");		for (String resultParam : resultParams) {			if (resultParam.startsWith("resultStatus")) {				resultStatus = gatValue(resultParam, "resultStatus");			}			if (resultParam.startsWith("result")) {				result = gatValue(resultParam, "result");			}			if (resultParam.startsWith("memo")) {				memo = gatValue(resultParam, "memo");			}		}	}	@Override	public String toString() {		StringBuilder builder = new StringBuilder();		builder.append("resultStatus={");		builder.append(resultStatus);		builder.append("};memo={");		builder.append(memo);		builder.append("};result={");		builder.append(result);		builder.append("}");		return builder.toString();	}	private String gatValue(String content, String key) {		StringBuilder builder = new StringBuilder();		builder.append(key);		builder.append("={");		String prefix = builder.toString();				return content.substring(content.indexOf(prefix) + prefix.length(),				content.lastIndexOf("}"));	}	/**	 * @return the resultStatus	 */	public String getResultStatus() {		return resultStatus;	}	/**	 * @return the memo	 */	public String getMemo() {		return memo;	}	/**	 * @return the result	 */	public String getResult() {		return result;	}}