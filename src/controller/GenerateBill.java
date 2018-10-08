package controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.itextpdf.io.font.FontConstants;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.Style;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.property.HorizontalAlignment;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.UnitValue;

import bean.BillBean;
import bean.FacultyBean;
import dao.GenerateBillDao;

 



/** 
 * Servlet implementation class GenerateBill
 */
@WebServlet("/generatebill")
public class GenerateBill extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GenerateBill() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int id = Integer.parseInt(request.getParameter("facultyCode"));
		int month = Integer.parseInt(request.getParameter("month"));
		int year = Integer.parseInt(request.getParameter("year"));
		
		String monthName = GenerateBillDao.getMonthForInt((month-1));
		
		FacultyBean faculty = GenerateBillDao.getFacultyDetails(id);
		
		System.out.println(faculty==null);// here to add
		
		System.out.println(faculty.getBankName());
		System.out.println(faculty.getBranchName());
		System.out.println(faculty.getDesignation());
		
		System.out.println(faculty.getEmployeeCode());
		System.out.println(faculty.getFacultyName());
		System.out.println(faculty.getFacultyType());
		
		System.out.println(faculty.getHomeAddress());
		System.out.println(faculty.getId());
		System.out.println(faculty.getIfsc());
		
		System.out.println(faculty.getMobile());
		System.out.println("officail address is empty"+faculty.getOfficialAddress());
		System.out.println(faculty.getAccount());
		
		System.out.println(faculty.getPancard());
		System.out.println(faculty.getPhone());
		System.out.println(faculty.getSubject());
		
		System.out.println(faculty.getTitle());
		
		//
		
		int totalClass=0;
		int  sum=0;
		int theory=0;
		int practical=0;
		
		// To fetch the bill records
				List<BillBean> billRecords = GenerateBillDao.getBill(id, month, year);
				if(billRecords.size()<0) {
					//Only then use c:if to show the data or the no records found
					// if there is data to display 
					//request.setAttribute("alumniRecordsFound", "true");
					//request.setAttribute("alumniRecords", billRecords);	
					System.out.println("no records");
				}else {
					//request.setAttribute("alumniRecordsFound", "false");
					
					for (BillBean a :billRecords) {
					
												
					}
					totalClass= billRecords.size();
					
					System.out.println("sum is"+sum);
					
					System.out.println("Totalclass"+totalClass);
					
					System.out.println("Theory"+ theory);
					
					System.out.println("practical"+ practical);
				}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//
		
		
		
		
		
		
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PdfDocument pdfDoc = new PdfDocument(new PdfWriter(baos));
        Document doc = new Document(pdfDoc);
        //doc.add(new Paragraph(String.format(
               // "You have submitted the following text using the %s method:",
                //request.getMethod())));
        //doc.add(new Paragraph(text));
        
        //Actual code
        
        
        //left image
        
        
        // Creating an ImageData object       
        String imFile = "C://Users//Vishal Joshi//Desktop//JAVA EE//workspace//informationManagement//WebContent//images/uor.png";       
        ImageData data = ImageDataFactory.create(imFile);              
        
        // Creating an Image object        
        Image leftImage = new Image(data);  
        
        leftImage .setFixedPosition(25,775); 
        leftImage .scaleToFit(60, 60);
        
        // Adding image to the document       
        doc.add(leftImage );  
        
        
        //Font size bold 
        Style bigFont = new Style();
        PdfFont font = PdfFontFactory.createFont(FontConstants.TIMES_BOLD);
        bigFont.setFont(font).setFontSize(26);
        
        
        
        
        Style normalFont = new Style();
        PdfFont font1 = PdfFontFactory.createFont(FontConstants.TIMES_BOLD);
        normalFont.setFont(font1).setFontSize(18);
        
        Style mediumFont = new Style();
        PdfFont font3 = PdfFontFactory.createFont(FontConstants.TIMES_BOLD);
        mediumFont.setFont(font3).setFontSize(11);

        Style smallFont = new Style();
        PdfFont font2 = PdfFontFactory.createFont(FontConstants.TIMES_BOLD);
        smallFont.setFont(font2).setFontSize(9);
        
        //Center Heading
        
        Paragraph p = new Paragraph("Center For Converging Technologies");
           p.setFixedPosition(100, 800, 600);
           p.addStyle(bigFont);
           p.setBold();
           doc.add(p);
        
        //center sub heading
        
           Paragraph p1 = new Paragraph("University Of Rajasthan");
           p1.setFixedPosition(200, 775, 400);
           p1.addStyle(normalFont);
           doc.add(p1);
        
        
        // Right image
           // Creating an ImageData object       
           String imFile1 = "C://Users//Vishal Joshi//Desktop//JAVA EE//workspace//informationManagement//WebContent//images/cct.png";       
           ImageData data1 = ImageDataFactory.create(imFile1);              
           
           // Creating an Image object        
           Image rightImage = new Image(data1);  
           
           rightImage .setFixedPosition(520,775); 
           rightImage .scaleToFit(60, 60);
           
           // Adding image to the document       
           doc.add(rightImage );  
        
           // left Column of the page 
        
           Paragraph lc = new Paragraph();
           
           lc.add(new Text("Name: ").setFontSize(10).setBold());
           lc.add(faculty.getTitle()+" "+faculty.getFacultyName());
           
           lc.add("\n");
           lc.add(new Text("Designation: ").setFontSize(10).setBold());
           lc.add(""+ faculty.getDesignation());
           
           lc.add("\n");
           lc.add(new Text("Subject/Deptt: ").setFontSize(10).setBold());
           lc.add(""+ faculty.getSubject());
           
           lc.add("\n");
           lc.add(new Text("Official Address: ").setFontSize(10).setBold());
           lc.add(""+ faculty.getOfficialAddress());
           
           lc.add("\n");
           lc.add(new Text("Home Address: ").setFontSize(10).setBold());
           lc.add(""+ faculty.getHomeAddress());
           
           lc.setFixedPosition(10, 680 ,300);
           //lc.addStyle(smallFont);
           doc.add(lc);
           
           
        // right Column of the page 
           
           Paragraph rc = new Paragraph();
           
           rc.add(new Text("Employess Code:").setFontSize(10).setBold());
           rc.add(" "+faculty.getEmployeeCode());
           
           rc.add("\n");
           rc.add(new Text("Pan Card: ").setFontSize(10).setBold());
           rc.add(""+ faculty.getPancard());
           
           rc.add("\n");
           rc.add(new Text("Phone: ").setFontSize(10).setBold());
           rc.add(""+ faculty.getPhone());
           
           rc.add("\n");
           rc.add(new Text("Mobile: ").setFontSize(10).setBold());
           rc.add(""+ faculty.getMobile());
           
           rc.setFixedPosition(450, 690 ,300);
           //rc.addStyle(smallFont);
           doc.add(rc);
           
           
         // Middle Column 1 
           
           
           
           Paragraph mc1 = new Paragraph();
           
           mc1.add(new Text("Bank Account No. : ").setFontSize(10).setBold());
           mc1.add(""+ faculty.getAccount());
           
           mc1.add("      ");
           
           mc1.add(new Text("Name of bank: ").setFontSize(10).setBold());
           mc1.add(""+ faculty.getBankName());
           
           mc1.add("      ");
           
           mc1.add("\n");
           
           mc1.add(new Text("Ifsc: ").setFontSize(10).setBold());
           mc1.add(""+ faculty.getIfsc());
           
           mc1.add("      ");
           
           mc1.add(new Text("Branch Address: ").setFontSize(10).setBold());
           mc1.add(""+ faculty.getBranchName());
           
           
           
           mc1.setFixedPosition(10, 645 ,700);
           //mc1.addStyle(smallFont);
           doc.add(mc1);
           
           
           
           	// Middle Column 2 
           
           
           
           Paragraph mc2 = new Paragraph();
           
           mc2.add(new Text("Renumeration Bill For Teaching at CCT Under(SFS) int the Month of "+monthName+","+ year).setFontSize(10).setBold());
           
           
           mc2.setFixedPosition(95, 620,600);
           //mc2.addStyle(smallFont);
           doc.add(mc2);
           
           
           //middletable1
           
           Paragraph paragraphTable1 = new Paragraph();
           Table table1 = new Table(10);
           table1.setWidth(UnitValue.createPercentValue(100)); 
           		table1.addHeaderCell("Sheet No.");
           		//table1.addCell("Sheet No.");
           		table1.addHeaderCell("Paper No.");
           		table1.addHeaderCell("Type");
           		table1.addHeaderCell("Day");
           		table1.addHeaderCell("Date");
           		table1.addHeaderCell("Time");
           		table1.addHeaderCell("Hour");
           		table1.addHeaderCell("Batch");
           		table1.addHeaderCell("Semester");
           		table1.addHeaderCell("Rate");
           		
           		for (BillBean b: billRecords) {
           			table1.addCell(b.getSheetNumber());
           			table1.addCell(b.getPaperNumber());
           			table1.addCell(b.getType());
           			table1.addCell(b.getDay());
           			table1.addCell(b.getDate().toString());
           			table1.addCell(b.getTime());
           			table1.addCell(b.getHours());
           			table1.addCell(b.getBatch());
           			table1.addCell(b.getSemester());
           			table1.addCell(Integer.toString(b.getRate()));
           			sum = sum+b.getRate();
					if(b.getType().equals("Theory")) {
						theory++;
					}else {
						practical++;
					}
											
				
				
           		}

           		
           totalClass= billRecords.size();
              
           //table1.addStyle(smallFont);
           //paragraphTable1.setFixedPosition(8, 565, 580);
           paragraphTable1.add("\n");
           paragraphTable1.add("\n");
           paragraphTable1.add("\n");
           paragraphTable1.add("\n");
           paragraphTable1.add("\n");
           paragraphTable1.add("\n");
           paragraphTable1.add("\n");
           paragraphTable1.add("\n");
           paragraphTable1.add("\n");
           paragraphTable1.add("\n");
           paragraphTable1.add("\n");
           paragraphTable1.add(table1);
           paragraphTable1.add("\n");
              //doc.add(paragraphTable1);    
           
           
           
                 
           // middle table 2 
              
              Table table2 = new Table(UnitValue.createPercentArray(new float[]{5,5,3}));
              table2.setWidth(UnitValue.createPercentValue(100));   
              
              table2.addCell("Total Classes : "+ billRecords.size());
              table2.addCell(" Total Amount : ");
              table2.addCell(" "+Integer.toString(sum)).setTextAlignment(TextAlignment.CENTER);
        
              table2.addCell("Theory Classes : "+ theory);
              table2.addCell(" TDS DEDUCTIONS(10%) Rs : ");
              table2.addCell(" "+Integer.toString(sum/10));	
        
              table2.addCell("Practical Classes : "+ practical);
              table2.addCell("Net Payable Amount Rs : ");
              table2.addCell(" "+Integer.toString( (sum- (sum/10) ) ));	

              table2.addStyle(smallFont);
              //table2.setFixedPosition(8, 565, 580);
                 //doc.add(table2);    
              paragraphTable1.add(table2);
              //paragraphTable1.setFixedPosition(8, 150, 580);
              //doc.add(paragraphTable1); // *****THIS WILL BE DOWN CZ DYNAMIC DATA IS THERE
              
              
        //certification
              paragraphTable1.add("\n");
              paragraphTable1.add("\n");
              paragraphTable1.add("\n");
              paragraphTable1.add(new Text(".                                                          Verification/Certificate                                                                   .").setFontSize(12).setBold());
              
        paragraphTable1.add("\n");      
        
        paragraphTable1.add("I ");
        paragraphTable1.add(new Text(faculty.getFacultyName()).setBold());
        paragraphTable1.add(" ,Solomnly declare that the best of my knowlegde and and beleif the above supplied information is correct and complete and that the classes and the other particulars shown therein (No objection of Head of Institution) are truly stated and are in accordance with the provisions of CCT stearring committee.");
       
        paragraphTable1.add("\n");
        paragraphTable1.add("\n");
        
        paragraphTable1.add(new Text(".                                                                                                             Signature of Faculty                                 ."));
        
        
        //For office use only
        
        paragraphTable1.add("\n");
        paragraphTable1.add(new Text(".                                                (For Office use only)").setBold().setFontSize(12));
        paragraphTable1.add(new Text("Attendance verified by:")); 
        
        
        //Middle table 3
        
        paragraphTable1.add("\n");
        paragraphTable1.add(new Text(".                    .")); 
        
        Table table3 = new Table(UnitValue.createPercentArray(new float[]{5,5}));
        table3.setWidth(UnitValue.createPercentValue(70));
        table3.setHorizontalAlignment(HorizontalAlignment.CENTER);
        
        table3.addCell("Name of Sub. Coordinator");
        table3.addCell("");
        table3.addCell("Name of Academic Coordinator:  ");
        table3.addCell("");
        
        
        
        paragraphTable1.add(table3);
        // This table should be added to the paragraphTable
        
        //
        // Budget head sign 
        paragraphTable1.add("\n");
        paragraphTable1.add("\n");

        
        paragraphTable1.add(new Text(".                                       ."));
        paragraphTable1.add(new Text("Budget Head of CCT : REM To Guest Faculty").setBold().setFontSize(12).setUnderline());
        paragraphTable1.add("\n");
        paragraphTable1.add(".                                                 Passed for Payment of  RS "+sum );
        
        paragraphTable1.add("\n");
        paragraphTable1.add("\n");
        
        paragraphTable1.add(new Text(".                                                                                                 Additinal Director/ Joint Director                                 ."));
        
        
        
        
        
        // must be in last dynamic data
              doc.add(paragraphTable1); 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       ///////////////////////////////////////////////////////////////////////////////////////////////// 
        //Paragraph p = new Paragraph("test");
     //   p.setFixedPosition(100, 800, 200);
      //  p.setBold();
     //   doc.add(p);
        
        
        
        

        
        
        
        //
     //   Table table = new Table(8);
    //    for (int i = 0; i < 16; i++) {
    //        table.addCell("h                              i");
   //     }
   //     doc.add(table);    
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        

        
        
        
        //
        doc.close();

        // setting some response headers
        response.setHeader("Expires", "0");
        response.setHeader("Cache-Control",
                "must-revalidate, post-check=0, pre-check=0");
        response.setHeader("Pragma", "public");
        // setting the content type
        response.setContentType("application/pdf");
        // the contentlength
        response.setContentLength(baos.size());
        // write ByteArrayOutputStream to the ServletOutputStream
        OutputStream os = response.getOutputStream();
        baos.writeTo(os);
        os.flush();
        os.close();
		
		
		
		
		
		
		
	    }
	}


