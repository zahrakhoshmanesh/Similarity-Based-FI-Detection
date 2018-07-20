import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class VarMetSim {
	public static void main(String[] args)
    {
	    //define set for each of the feature in the SPL
	
	    //first work on variables of each feature and define set for each feature
	    
    //*****************************define features *********************************

	
	    //base feature
        Set<String> base = new HashSet<String>();
        //variables-methods
        String[] basevalue = {"id","name","clientcounter","clients","subject","body","from","to","emailcounter","deliver","incoming","mail","outgoing","sendemail","client","getname","createclient","getclientbyid","getclientbyaddress","resetclients","tostring","email","createemail","isreadable","printmail","cloneemail","getemailfrom","getid","getemailsubject","getemailto","setemailbody","setemailfrom","setemailsubject","setemailto","getemailbody"};  
        base.addAll(Arrays.asList(basevalue));
        
        
        //addressbook feature
        Set<String> addressbook = new HashSet<String>();
        //variable-methods
        String[] addressbookvalue = {"addressbook","alias","receivers","getaddressbookreceiversforalias","addaddressbookentry","outgoing","addressbookentry","addreceiver","getalias","getreceivers"};
        addressbook.addAll(Arrays.asList(addressbookvalue));
       
        
        
        //autoresponder feature
        Set<String> autoresponder = new HashSet<String>();
        //variables-methods
        String[] autorespondervalue = {"autoresponse","setautoresponse","isautoresponse","autorespond","incoming"};  
        autoresponder.addAll(Arrays.asList(autorespondervalue));
       
        
        
        //decrypt feature
        Set<String> decrypt = new HashSet<String>();
        //variables-methods
        String[] decryptvalue = {"privkey","incoming"}; 
        decrypt.addAll(Arrays.asList(decryptvalue));
        
        
        
        //encrypt feature
        Set<String> encrypt = new HashSet<String>();
        //variable-methods
        String[] encryptvalue = {"isencrypted","encryptionkey","pubkey","isreadable","printmail","isencrypted","setemailencryptionkey","getemailencryptionkey","outgoing"};  
        encrypt.addAll(Arrays.asList(encryptvalue));
       
        
        
        
        //forward feature
        Set<String> forward = new HashSet<String>();
        //variables-methods
        String[] forwardvalue = {"forwardreceiver","setforwardreceiver","getforwardreceiver","forward","incoming"};
        forward.addAll(Arrays.asList(forwardvalue));
        
        
        
        
        //keys feature
        Set<String> keys = new HashSet<String>();
        //variable-methods
        String[] keysvalue = {"ketring","privkey","keyowner","pubkey","setprivatekey","getprivatekey","generatekeypair","addkeyringentry","getkeyringpublickeybyclient","iskeypairvalid","keyringentry","getkeyowner","getpublickey"}; 
        keys.addAll(Arrays.asList(keysvalue));
        
        
        
        //sign feature
        Set<String> sign = new HashSet<String>();
        //variables-methods
        String[] signvalue = {"privkey","signed","signkey","outgoing","sign","printmail","setemailissigned","setemailsignkey","issigned","getemailsignkey"};  
        sign.addAll(Arrays.asList(signvalue));
       
        
        
        //verify feature
        Set<String> verify = new HashSet<String>();
        //variables-methods
        String[] verifyvalue = {"pubkey","issignatureverified","incoming","verify","printmail","issignatureverified","setissignatureverified"};
        verify.addAll(Arrays.asList(verifyvalue));
        
        
        
               
        //*****************************set operations *********************************
        
        // union
        Set<String> union = new HashSet<String>(sign);
        union.addAll(verify);
        //System.out.print("Union of the two Set");
        //System.out.println(union);
 
        //  intersection
        Set<String> intersection = new HashSet<String>(sign);
        intersection.retainAll(verify);
        //System.out.println("Intersection of the two Set");
        //System.out.println(intersection);
 
        
        
        // union of all sets
        Set<String> unionall = new HashSet<String>(base);
        unionall.addAll(forward);
        unionall.addAll(verify);
        unionall.addAll(sign);
        unionall.addAll(keys);
        unionall.addAll(encrypt);
        unionall.addAll(decrypt);
        unionall.addAll(autoresponder);
        unionall.addAll(addressbook);
        
        // difference
        Set<String> difference1 = new HashSet<String>(unionall);
        difference1.removeAll(sign);
        Set<String> difference2 = new HashSet<String>(unionall);
        difference2.removeAll(verify);
        
        
        
        //*****************************distance measurement*********************************

        //jaccard distance
        
     
        int conjunction=intersection.size();
        int disconjunction=union.size();
        double jaccard= (conjunction*1.0/disconjunction*1.0);
        System.out.print(jaccard);
        
      
               
        
        //hamming distance
       /*
        Set<String> intersection1 = new HashSet<String>(difference1);
        intersection1.retainAll(difference2);
        double hamming= (intersection.size()+intersection1.size()+0.0)/unionall.size()*1.0;
        System.out.println(hamming);
        //System.out.print(intersection.size());
        
         */
         
         
        
           
        
        //Sorensein Similarity
      // double sorension=(2.0*intersection.size())/(verify.size()+sign.size());
        //System.out.print(sorension);
    }
}
