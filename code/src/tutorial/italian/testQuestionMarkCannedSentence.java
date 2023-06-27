package tutorial.italian;
import simplenlg.framework.DocumentElement;
import simplenlg.framework.NLGFactory;
import simplenlg.lexicon.Lexicon;
import simplenlg.lexicon.italian.ITXMLLexicon;
import simplenlg.realiser.Realiser;

public class testQuestionMarkCannedSentence {
public static void main(String[] args) {
		
		/*########LESSICO##########*/
		
		//prova lessico italiano, 
		Lexicon lexIta = new ITXMLLexicon();
		
		/*########CREAZIONE FACTORY##########*/
		
		NLGFactory factory = new NLGFactory(lexIta);
		
		/*########CREAZIONE realiser##########*/
		Realiser realiser = new Realiser();
		String output = "";
		//realiser.setDebugMode(true);
		
		DocumentElement sentence = factory.createSentence("hai sonno?");
		output = realiser.realiseSentence(sentence);
		System.out.println(output);
	}
}
