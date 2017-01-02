package Controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

import net.sourceforge.pinyin4j.PinyinHelper;
import net.sourceforge.pinyin4j.format.HanyuPinyinCaseType;
import net.sourceforge.pinyin4j.format.HanyuPinyinOutputFormat;
import net.sourceforge.pinyin4j.format.HanyuPinyinToneType;
import net.sourceforge.pinyin4j.format.HanyuPinyinVCharType;
import net.sourceforge.pinyin4j.format.exception.BadHanyuPinyinOutputFormatCombination;

import org.apache.struts2.ServletActionContext;

import po.Book;

public class AddBook {
	private String NAME;
	private String DISC;
	private double PRICE;
	private int NUM;
	private File PIC;
	private String PICContentType;
	private String PICFileName;
	    public String getPingYin(String src) {  
	        char[] t1 = null;  
	        t1 = src.toCharArray();  
	        String[] t2 = new String[t1.length];  
	        HanyuPinyinOutputFormat t3 = new HanyuPinyinOutputFormat();  
	          
	        t3.setCaseType(HanyuPinyinCaseType.LOWERCASE);  
	        t3.setToneType(HanyuPinyinToneType.WITHOUT_TONE);  
	        t3.setVCharType(HanyuPinyinVCharType.WITH_V);  
	        String t4 = "";  
	        int t0 = t1.length;  
	        try {  
	            for (int i = 0; i < t0; i++) {  
	                // 判断是否为汉字字符  
	                if (java.lang.Character.toString(t1[i]).matches(  
	                        "[\\u4E00-\\u9FA5]+")) {  
	                    t2 = PinyinHelper.toHanyuPinyinStringArray(t1[i], t3);  
	                    t4 += t2[0];  
	                } else  
	                    t4 += java.lang.Character.toString(t1[i]);  
	            }  
	            // System.out.println(t4);  
	            return t4;  
	        } catch (BadHanyuPinyinOutputFormatCombination e1) {  
	            e1.printStackTrace();  
	        }  
	        return t4;  
	    }  
	public String execute() throws Exception{
		InputStream is = new FileInputStream(PIC);//基于myFile创建一个文件输入流  
		System.out.println("OK2");
		String uploadPath = ServletActionContext.getServletContext().getRealPath("/upload");// 设置上传文件目录   
		String PICFILENAME = getPingYin(this.getPICFileName());
		File toFile = new File(uploadPath, PICFILENAME);// 设置目标文件  
		OutputStream os = new FileOutputStream(toFile);// 创建一个输出流  
		byte[] buffer = new byte[1024];   //设置缓存  
		int length = 0;
		while ((length = is.read(buffer)) > 0) {//读取myFile文件输出到toFile文件中  
            os.write(buffer, 0, length);
        }
		is.close();//关闭输入流
		os.close();//关闭输出流
		Book b = new Book();
		b.setDISC(DISC);
		b.setNAME(NAME);
		b.setNUM(NUM);
		b.setPIC("upload/"+PICFILENAME);//允许png gif jpg
//		b.setPIC("file:///"+uploadPath+"\\"+this.getPICFileName());
		b.setPRICE(PRICE);
		if(DAO.BookDao.Insert(b))
			return "success";
		else return "fail";
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public String getDISC() {
		return DISC;
	}
	public void setDISC(String dISC) {
		DISC = dISC;
	}
	public double getPRICE() {
		return PRICE;
	}
	public void setPRICE(double pRICE) {
		PRICE = pRICE;
	}
	public int getNUM() {
		return NUM;
	}
	public void setNUM(int nUM) {
		NUM = nUM;
	}
	public File getPIC() {
		return PIC;
	}
	public void setPIC(File pIC) {
		PIC = pIC;
	}
	public String getPICContentType() {
		return PICContentType;
	}
	public void setPICContentType(String pICContentType) {
		PICContentType = pICContentType;
	}
	public String getPICFileName() {
		return PICFileName;
	}
	public void setPICFileName(String pICFileName) {
		PICFileName = pICFileName;
	}
	
}
