class Main {
    public static void main(String[] args) {
      String Sentance = "Many different words have vowels".toLowerCase();

        String[] splt = Sentance.split(" "); 
  
        for (String word : splt) {
            System.out.println(word);
            System.out.println(countVowels(word));
            }

    }



public static int countVowels(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }
}
