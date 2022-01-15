import java.util.ArrayList;
import java.util.Arrays;

public class BlockChainProgramming {
	public static void main(String[] args) {
		 // demonstrate a hash function
		String statement1 = "My world is perfect";
		int hashValue = statement1.hashCode();
		System.out.println("Statement1 = " + statement1 + "whose hash value is: " + hashValue);
		// let's hash an array
		String [] list1 = {"alex","becky", "cyril"};
		String [] list2 = {"alex","becky", "Cyril"};
		int hash1 = Arrays.hashCode(list1);
		int hash2 = Arrays.hashCode(list2);
		System.out.println("hash1: " + hash1 + " va hash2: " + hash2);
		
		// demonstrate a series of blocks in a chain 
		ArrayList<Block> blockChain = new ArrayList<Block>();
		String[] initialValues = {"Shad has $700", "Miguel has $550"};
		Block firstBlock = new Block(initialValues, 0);
		blockChain.add(firstBlock);
		System.out.println("First block is: " + firstBlock.toString());
		System.out.println("The blockchain is " + blockChain.toString());
		// blockHash = 1645480768
		
		// block two
		String[] shadGivesItAway = {"Shad gives Tim $400 ", "Shad gives Tany $60", "Shad gives Terry $100"};
		Block secondBlock = new Block(shadGivesItAway, firstBlock.getBlockHash());
		blockChain.add(secondBlock);
		System.out.println("Second block is: " + secondBlock.toString());
		System.out.println("The blockchain is " + blockChain.toString());
		
		// blockHash = 822545477
		
		// block three
		String[] shadGetsSomeBack = {"Tim gives Shad $10 ", "Terry gives $50 to Shad"};
		Block thirdBlock = new Block(shadGetsSomeBack, secondBlock.getBlockHash());
		blockChain.add(thirdBlock);
		System.out.println("Third block is: " + thirdBlock.toString());
		System.out.println("The blockchain is " + blockChain.toString());
		
		// blockHash = 1035417822
	}
}
