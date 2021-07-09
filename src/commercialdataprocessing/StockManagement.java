package commercialdataprocessing;

public interface StockManagement
{
	public void displayPresentCompanySharesDetails();
	public void buyStocks(CompanyShares companySharesDetails);
	public void sellStocks(String companySymbol);
	public void displayDetailPortFolio();
}
