package dip.violation;

public class TaxCalculater {

	LogType log;

	public TaxCalculater(LogType log) {
		this.log = log;
	}

	public int calculateTax(int amt, int rate) {

		int result=-1;
		Loggarable logger;
		try {
			result = amt / rate;
			
		} catch (Exception ex) {
			if(log == LogType.XML) {
				logger = new XmlLogger();
				logger.log(ex.getMessage());
			}
			else if(log == LogType.TXT) {
				logger = new TextLogger();
				logger.log(ex.getMessage());
			}
			else if(log == LogType.JSON) {
				logger = new JsonLogger();
				logger.log(ex.getMessage());
			}

		}
		return result;
	}
}
