package question3;


public class MainTest
{
    public static void main (String [] args)
    {
        System. out. print('\u000C');
        
        AuditeurCNAM auditeur1 = new AuditeurCNAM("Bou Rouphael","Rim","12345");
        System.out.println("Nom : " + auditeur1.nom());
        System.out.println("Prenom : " + auditeur1.prenom());
        System.out.println("Matricile : " + auditeur1.matricule());
        System.out.println("Login : " + auditeur1.login());
        System.out.println("toString methode : " + auditeur1.toString());
        
        System.out.println("---------------------------");
        
        
        AuditeurCNAM auditeur2 = new AuditeurCNAM("Thé","Cloé","9654");
        System.out.println("Nom : " + auditeur2.nom());
        System.out.println("Prenom : " + auditeur2.prenom());
        System.out.println("Matricile : " + auditeur2.matricule());
        System.out.println("Login : " + auditeur2.login());
        System.out.println("toString methode : " + auditeur2.toString());
        
        System.out.println("---------------------------");
        
        AuditeurCNAM auditeur3 = new AuditeurCNAM("Avec-tiret","Essai","12365");
        System.out.println("Nom : " + auditeur3.nom());
        System.out.println("Prenom : " + auditeur3.prenom());
        System.out.println("Matricile : " + auditeur3.matricule());
        System.out.println("Login : " + auditeur3.login());
        System.out.println("toString methode : " + auditeur3.toString());
    }
}
