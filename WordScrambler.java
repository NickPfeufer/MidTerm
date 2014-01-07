class WordScrambler {
	private String[] scrambledWords;

	private String[] wordArr = {"cat", "dog", "Karsan", "catmun", "hatmun", "firehipocar"};

	public WordScrambler(){
		scrambledWords = mixedWords(wordArr);
	}

	private String recombine(String word1, String word2){
		return (word1.substring(0, word1.length()/2) + word2.substring(word2.length()/2, word2.length()));

	}
	private String[] mixedWords(String[] words){
		String[] recombined = new String[words.length];
		for (int i=0; i<recombined.length; i++) {
			if(i%2 == 0){
				recombined[i] = recombine(words[i], words[i+1]);
			}else {
				recombined[i] = recombine(words[i], words[i-1]);
			}
		}
		return recombined;
	}
	// testing stuff
	public void printWords(){
		for (int i = 0; i<scrambledWords.length; i++) {
			System.out.println(scrambledWords[i]);
		}
	}

	public static void main(String[] args) {
		WordScrambler bob = new WordScrambler();
		bob.printWords();
	}
}