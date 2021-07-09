package commercialdataprocessing;
import java.util.Date;

public class CompanyShares
{

	private String companyName;
	private String companySymbol;
	private int numberOfShares;
	private double pricePerShare;
	private Date date;
	public String getCompanyName()
	{
		return companyName;
	}
	public void setCompanyName(String companyName)
	{
		this.companyName = companyName;
	}
	public String getCompanySymbol()
	{
		return companySymbol;
	}
	public void setCompanySymbol(String companySymbol) 
	{
		this.companySymbol = companySymbol;
	}
	public int getNumberOfShares() 
	{
		return numberOfShares;
	}
	public void setNumberOfShares(int numberOfShares) 
	{
		if(numberOfShares <= 0)
		{
			System.err.println("Number of Shares can not be 0, Enter greater than 0 !");
		}
		else
		{
			this.numberOfShares = numberOfShares;
		}
	}
	public double getPricePerShare() 
	{
		return pricePerShare;
	}
	public void setPricePerShare(double pricePerShare) 
	{
		if(pricePerShare <= 0.0)
		{
			System.err.println("Price per share can not be 0, Enter price greater than 0 !");
		}
		else
		{
			this.pricePerShare = pricePerShare;
		}
	}
	public Date getDate()
	{
		return date;
	}
	public void setDate(Date date) 
	{
		this.date = date;
	}
	public CompanyShares(String companyName, String companySymbol, int numberOfShares, double pricePerShare,
			Date date)
	{
		super();
		this.companyName = companyName;
		this.companySymbol = companySymbol;
		this.numberOfShares = numberOfShares;
		this.pricePerShare = pricePerShare;
		this.date = date;
	}
	public CompanyShares()
	{
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() 
	{
		return "CompanyShares [companyName=" + companyName + ", companySymbol=" + companySymbol + ", numberOfShares="
				+ numberOfShares + ", pricePerShare=" + pricePerShare + ", date=" + date + "]";
	}
	
	
	
}
