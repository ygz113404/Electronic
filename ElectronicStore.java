
import java.util.Scanner;

import javax.swing.JOptionPane;


public class ElectronicStore {
    LinkedList pcBrands = new LinkedList();
    static LinkedList asus = new LinkedList();
    static LinkedList monster = new LinkedList();
    static LinkedList apple = new LinkedList();
    static LinkedList lenova = new LinkedList();
    static LinkedList acer = new LinkedList();
    Tree asusTree = new Tree();
    Tree monsterTree = new Tree();
    Tree appleTree = new Tree();
    Tree lenovaTree = new Tree();
    Tree acerTree = new Tree();
    Tree tree = new Tree();
    //Telefonlar
    static LinkedList phoneBrands = new LinkedList();
    static LinkedList samsung = new LinkedList();
    static LinkedList xiaomi = new LinkedList();
    static LinkedList iphone = new LinkedList();
    static LinkedList huawei = new LinkedList();
    static LinkedList oppo = new LinkedList();
    Tree samsungTree = new Tree();
    Tree xiaomiTree = new Tree();
    Tree iphoneTree = new Tree();
    Tree huaweiTree = new Tree();
    Tree oppoTree = new Tree();
    //DiÄŸer ÃœrÃ¼nler
    static LinkedList otherProducts = new LinkedList();
    static LinkedList beyazEsya = new LinkedList();
    static LinkedList ses = new LinkedList();
    static LinkedList goruntu = new LinkedList();
    static LinkedList isitmaSogutma = new LinkedList();
    static LinkedList televizyon = new LinkedList();
    Tree beyazEsyaTree = new Tree();
    Tree sesTree = new Tree();
    Tree goruntuTree = new Tree();
    Tree isitmaSogutmaTree = new Tree();
    Tree televizyonTree = new Tree();

    public static  void asusProduct(){
        productAdd(asus, "5- ZENBOOK         Price: 2789,54TL");
        productAdd(asus, "4- ZEPHYRUS        Price: 4744,46TL");
        productAdd(asus, "3- ROG             Price: 7520,00TL");
        productAdd(asus, "2- EXPERTBOOK      Price: 4658,00TL");
        productAdd(asus, "1- TUF             Price: 3200,10TL");
    }
    public static void monsterProduct(){
        productAdd(monster, "5- Abra         Price: 5144,88TL");
        productAdd(monster, "4- Tulpar       Price: 6985,54TL");
        productAdd(monster, "3- Semruk       Price: 3620,54TL");
        productAdd(monster, "2- Huma         Price: 5233,20TL");
        productAdd(monster, "1- Markut       Price: 3000,00TL");
    }
    public  static void appleProduct(){
        productAdd(apple, "1- MacBook Pro    Price: 10500,99TL");
    }
    public static void lenovaProduct(){
        productAdd(lenova, "3- IdeaPad       Price: 8756,22TL");
        productAdd(lenova, "2- Legion        Price: 5500,33TL");
        productAdd(lenova, "1- IdeaCentre    Price: 2680,54TL");
    }
    public static  void acerProduct(){
        productAdd(acer, "5- PORSCHE         Price: 4789,54TL");
        productAdd(acer, "4- Swift           Price: 4110,00TL");
        productAdd(acer, "3- Aspire          Price: 3211,54TL");
        productAdd(acer, "2- Nitro           Price: 8759,50TL");
        productAdd(acer, "1- Chromebook      Price: 4632,54TL");
    }
    public static void samsungProduct(){
        productAdd(samsung, "1- Galaxy         Price: 3210,00TL");
    }
    public static void xiaomiProduct(){
        productAdd(xiaomi, "3- Redmi           Price: 3500,00TL");
        productAdd(xiaomi, "2- Mi              Price: 4367,54TL");
        productAdd(xiaomi, "1- Black Shark     Price: 6789,54TL");
    }
    public static void iphoneProduct(){
        productAdd(iphone, "1- Iphone          Price: 12000,36TL");
    }
    public static  void huaweiProduct(){
        productAdd(huawei, "5- P40             Price: 7689,23TL");
        productAdd(huawei, "4- P20             Price: 6321,57TL");
        productAdd(huawei, "3- Mate            Price: 4235,54TL");
        productAdd(huawei, "2- P30             Price: 4569,54TL");
        productAdd(huawei, "1- SmartPro        Price: 8700,23TL");
    }
    public static void oppoProduct(){
        productAdd(oppo, "3- A15               Price: 4710,36TL");
        productAdd(oppo, "2- A73               Price: 5000,54TL");
        productAdd(oppo, "1- Reno              Price: 4122,74TL");
    }
    public static void beyazEsyaProduct(){
        productAdd(beyazEsya, "5- Regal BM       Price: 5231,22TL");
        productAdd(beyazEsya, "4- Vestel CMI     Price: 8555,56TL");
        productAdd(beyazEsya, "3- Vestel MD-20   Price: 1200,44TL");
        productAdd(beyazEsya, "2- Altus AL-360   Price: 7541,41TL");
        productAdd(beyazEsya, "1- Grundig GSND   Price: 5200,00TL");
    }
    public static void sesProduct(){
        productAdd(ses, "4- Haylou T15           Price: 1200,54TL");
        productAdd(ses, "3- Airpods              Price: 2100,54TL");
        productAdd(ses, "2- Earbuds              Price: 160,54TL");
        productAdd(ses, "1- JBL                  Price: 750,00TL");
    }
    public static void goruntuProduct(){
        productAdd(goruntu, "EverestSC-HD01   Price: 1000,20TL");
        productAdd(goruntu, "OEMPro-hd05      Price: 3600,30TL");
        productAdd(goruntu, "HADRONX11        Price: 4780,54TL");
        productAdd(goruntu, "logitechC310     Price: 4170,18TL");
        productAdd(goruntu, "DEEP BLUE        Price: 4102,54TL");
    }
    public static void isitmaSogutmaProduct(){
        productAdd(isitmaSogutma, "Vestel Flora        Price: 2500,54TL");
        productAdd(isitmaSogutma, "Baymak Elegant      Price: 7920,00TL");
        productAdd(isitmaSogutma, "Bosch Climate       Price: 4175,78TL");
        productAdd(isitmaSogutma, "Raks Eco Plus       Price: 3600,40TL");
    }
    public static void televizyonProduct(){
        productAdd(televizyon, "Philips 50PUS7805      Price: 6300,54TL");
        productAdd(televizyon, "Vestel 50U9500         Price: 2789,54TL");
        productAdd(televizyon, "Samsung40T5300         Price: 4100,20TL");
        productAdd(televizyon, "LG 43UN71006           Price: 3600,80TL");
        productAdd(televizyon, "SkytechST-3230         Price: 7800,54TL");
    }

    public void pcBrandName(){
        pcBrandAdd(pcBrands);
    }
    public void phoneBrandName(){
        phoneBrandAdd(phoneBrands);
    }
    public void otherProductName(){
        otherBrandAdd(otherProducts);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        


      LinkedList pcBrands = new LinkedList();
        //BÄ°LGÄ°SAYAR LÄ°STELERÄ° BURADA
        LinkedList asus = new LinkedList();
        LinkedList monster = new LinkedList();
        LinkedList apple = new LinkedList();
        LinkedList lenova = new LinkedList();
        LinkedList acer = new LinkedList();
        pcBrandAdd(pcBrands);
        productAdd(asus, "5- ZENBOOK         Price: 2789,54TL");
        productAdd(asus, "4- ZEPHYRUS        Price: 4744,46TL");
        productAdd(asus, "3- ROG             Price: 7520,00TL");
        productAdd(asus, "2- EXPERTBOOK      Price: 4658,00TL");
        productAdd(asus, "1- TUF             Price: 3200,10TL");
        productAdd(monster, "5- Abra         Price: 5144,88TL");
        productAdd(monster, "4- Tulpar       Price: 6985,54TL");
        productAdd(monster, "3- Semruk       Price: 3620,54TL");
        productAdd(monster, "2- Huma         Price: 5233,20TL");
        productAdd(monster, "1- Markut       Price: 3000,00TL");
        productAdd(apple, "1- MacBook Pro    Price: 10500,99TL");
        productAdd(lenova, "3- IdeaPad       Price: 8756,22TL");
        productAdd(lenova, "2- Legion        Price: 5500,33TL");
        productAdd(lenova, "1- IdeaCentre    Price: 2680,54TL");
        productAdd(acer, "5- PORSCHE         Price: 4789,54TL");
        productAdd(acer, "4- Swift           Price: 4110,00TL");
        productAdd(acer, "3- Aspire          Price: 3211,54TL");
        productAdd(acer, "2- Nitro           Price: 8759,50TL");
        productAdd(acer, "1- Chromebook      Price: 4632,54TL");
       
        
        LinkedList phoneBrands = new LinkedList();
        phoneBrandAdd(phoneBrands);
        //TELEFON LÄ°STELERÄ° BURADA
        LinkedList samsung = new LinkedList();
        LinkedList xiaomi = new LinkedList();
        LinkedList iphone = new LinkedList();
        LinkedList huawei = new LinkedList();
        LinkedList oppo = new LinkedList();
        productAdd(samsung, "1- Galaxy         Price: 3210,00TL");
        productAdd(xiaomi, "3- Redmi           Price: 3500,00TL");
        productAdd(xiaomi, "2- Mi              Price: 4367,54TL");
        productAdd(xiaomi, "1- Black Shark     Price: 6789,54TL");
        productAdd(iphone, "1- Iphone          Price: 12000,36TL");
        productAdd(huawei, "5- P40             Price: 7689,23TL");
        productAdd(huawei, "4- P20             Price: 6321,57TL");
        productAdd(huawei, "3- Mate            Price: 4235,54TL");
        productAdd(huawei, "2- P30             Price: 4569,54TL");
        productAdd(huawei, "1- SmartPro        Price: 8700,23TL");
        productAdd(oppo, "3- A15               Price: 4710,36TL");
        productAdd(oppo, "2- A73               Price: 5000,54TL");
        productAdd(oppo, "1- Reno              Price: 4122,74TL");
        LinkedList otherProducts = new LinkedList();
        otherBrandAdd(otherProducts);
        //ELEKTRONÄ°K EÅ�YA LÄ°STELERÄ° BURADA
        LinkedList beyazEsya = new LinkedList();
        LinkedList ses = new LinkedList();
        LinkedList goruntu = new LinkedList();
        LinkedList isitmaSogutma = new LinkedList();
        LinkedList televizyon = new LinkedList();
        productAdd(beyazEsya, "5- Regal BM       Price: 5231,22TL");
        productAdd(beyazEsya, "4- Vestel CMI     Price: 8555,56TL");
        productAdd(beyazEsya, "3- Vestel MD-20   Price: 1200,44TL");
        productAdd(beyazEsya, "2- Altus AL-360   Price: 7541,41TL");
        productAdd(beyazEsya, "1- Grundig GSND   Price: 5200,00TL");
        productAdd(ses, "4- Haylou T15           Price: 1200,54TL");
        productAdd(ses, "3- Airpods              Price: 2100,54TL");
        productAdd(ses, "2- Earbuds              Price: 160,54TL");
        productAdd(ses, "1- JBL                  Price: 750,00TL");
        productAdd(goruntu, "5- EverestSC-HD01   Price: 1000,20TL");
        productAdd(goruntu, "4- OEMPro-hd05      Price: 3600,30TL");
        productAdd(goruntu, "3- HADRONX11        Price: 4780,54TL");
        productAdd(goruntu, "2- logitechC310     Price: 4170,18TL");
        productAdd(goruntu, "1- DEEP BLUE        Price: 4102,54TL");
        productAdd(isitmaSogutma, "4- Vestel Flora        Price: 2500,54TL");
        productAdd(isitmaSogutma, "3- Baymak Elegant      Price: 7920,00TL");
        productAdd(isitmaSogutma, "2- Bosch Climate       Price: 4175,78TL");
        productAdd(isitmaSogutma, "1- Raks Eco Plus       Price: 3600,40TL");
        productAdd(televizyon, "5- Philips 50PUS7805      Price: 6300,54TL");
        productAdd(televizyon, "4- Vestel 50U9500         Price: 2789,54TL");
        productAdd(televizyon, "3- Samsung40T5300         Price: 4100,20TL");
        productAdd(televizyon, "2- LG 43UN71006           Price: 3600,80TL");
        productAdd(televizyon, "1- SkytechST-3230         Price: 7800,54TL");
        //--------------------------------------------

        System.out.println("Hangi kategoriden Ã¼rÃ¼n almak istiyorsunuz?");

        System.out.println("Bilgisayar iÃ§in 1\nTelefon iÃ§in 2\nDiÄŸer Ã¼rÃ¼nler iÃ§in 3'e basÄ±nÄ±z.");
        int x = sc.nextInt();
        if (x == 1) {
            System.out.println("Bilgisayar markalarÄ± listeleniyor.");
            pcBrands.outputList();
            System.out.println("Hangi marka Ã¼rÃ¼nlere bakmak istiyorsunuz ? ");
            System.out.println("Asus iÃ§in 1\nMonster iÃ§in 2\nApple iÃ§in 3\nLenova iÃ§in 4\nAcer iÃ§in 5'e basÄ±nÄ±z.");
            int y = sc.nextInt();
            if (y == 1) {
                System.out.println("Asus marka bilgisayarlar listeleniyor. ");
                asus.outputList();
            } else if (y == 2) {
                System.out.println("Monster marka bilgisayarlar listeleniyor. ");
                monster.outputList();
            } else if (y == 3) {
                System.out.println("Apple marka bilgisayarlar listeleniyor. ");
                apple.outputList();
            } else if (y == 4) {
                System.out.println("Lenova marka bilgisayarlar listeleniyor. ");
                lenova.outputList();
            } else if (y == 5) {
                System.out.println("Acer marka bilgisayarlar listeleniyor. ");
                acer.outputList();
            }
        } else if (x == 2) {
            System.out.println("Telefon markalarÄ± listeleniyor.");
            phoneBrands.outputList();
            System.out.println("Hangi marka Ã¼rÃ¼nlere bakmak istiyorsunuz ? ");
            System.out.println("Samsung iÃ§in 1\nXiaomi iÃ§in 2\nIphone iÃ§in 3\nHuawei iÃ§in 4\nOppo iÃ§in 5'e basÄ±nÄ±z.");
            int z = sc.nextInt();
            if (z == 1) {
                System.out.println("Samsung marka telefonlar listeleniyor. ");
                samsung.outputList();
            } else if (z == 2) {
                System.out.println("Xiaomi marka telefonlar listeleniyor. ");
                xiaomi.outputList();
            } else if (z == 3) {
                System.out.println("Iphone marka telefonlar listeleniyor. ");
                iphone.outputList();
            } else if (z == 4) {
                System.out.println("Huawei marka telefonlar listeleniyor. ");
                huawei.outputList();
            } else if (z == 5) {
                System.out.println("Oppo marka telefonlar listeleniyor. ");
                oppo.outputList();

            }
        } else if (x == 3) {
            System.out.println("DiÄŸer Ã¼rÃ¼nler listeleniyor.");
            otherProducts.outputList();
            System.out.println("Hangi kategorideki Ã¼rÃ¼nlere bakmak istiyorsunuz ? ");
            System.out.println("Beyaz EÅŸya iÃ§in 1\nSes sistemleri iÃ§in 2\nGÃ¶rÃ¼ntÃ¼ sistemleri iÃ§in 3\nIsÄ±tma ve SoÄŸutma iÃ§in 4\nTelevizyon iÃ§in 5'e basÄ±nÄ±z.");
            int k = sc.nextInt();
            if (k == 1) {
                System.out.println("Beyaz eÅŸya Ã¼rÃ¼nleri listeleniyor. ");
                beyazEsya.outputList();
            } else if (k == 2) {
                System.out.println("Ses sistemleri Ã¼rÃ¼nleri listeleniyor. ");
                ses.outputList();
            } else if (k == 3) {
                System.out.println("GÃ¶rÃ¼ntÃ¼ sistemleri Ã¼rÃ¼nleri listeleniyor. ");
                goruntu.outputList();
            } else if (k == 4) {
                System.out.println("IsÄ±tma ve SoÄŸutma Ã¼rÃ¼nleri listeleniyor. ");
                isitmaSogutma.outputList();
            } else if (k == 5) {
                System.out.println("Televizon Ã¼rÃ¼nleri listeleniyor. ");
                televizyon.outputList();

            }
        }


    }

    public static void pcBrandAdd(LinkedList list) {
        list.insertAtFront("Asus");
        list.insertAtFront("Monster");
        list.insertAtFront("Apple");
        list.insertAtFront("Lenova");
        list.insertAtFront("Acer");

    }

    public static void phoneBrandAdd(LinkedList list) {
        list.insertAtFront("Samsung");
        list.insertAtFront("Xiaomi");
        list.insertAtFront("Iphone");
        list.insertAtFront("Huawei");
        list.insertAtFront("OPPO");
    }

    public static void otherBrandAdd(LinkedList list) {
        list.insertAtFront("Beyaz EÅŸya");
        list.insertAtFront("Ses");
        list.insertAtFront("GÃ¶rÃ¼ntÃ¼");
        list.insertAtFront("IsÄ±tma ve SoÄŸutma");
        list.insertAtFront("Televizyon");
    }

    public static void productAdd(LinkedList list, String product) {
        list.insertAtFront(product);

    }
    public static void markaSec(LinkedList list, Tree name){
    	Node p = list.first;
        while (p != null) {
        	  name.insert(p.getData());
        	  p=p.getLink();
        	  
		}
        name.preorderPrint2();

    }
    

}
