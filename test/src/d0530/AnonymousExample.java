package d0530;

public class AnonymousExample { 
    public static void main(String[] args) { 
          Anonymous anony = new Anonymous(); 
          // �͸� ��ü �ʵ� ��� 
          anony.field.turnOn(); 
          // �͸� ��ü ���� ���� ��� 
          anony.method1(); 
          // �͸� ��ü �Ű��� ��� 
          anony.method2(new RemoteControl() { 
              @Override 
               public void turnOn() { 
                    System.out.println("smart TV�� �մϴ�."); 
                } 
               @Override 
                public void turnOff() { 
                     System.out.println("smart TV�� ���ϴ�."); 
                } 
          }); 
    } 
}