METHOD 1
 for(int key: map.keySet()){   // THIS WILL GET ALL THE KEYS ONE BY ONE
			freqarr[map.get(key)]++; 
		}


METHOD 2
public static void main(String[] arg)
    {
        Map<String,String> gfg = new HashMap<String,String>();
      
        // enter name/url pair
        gfg.put("GFG", "geeksforgeeks.org");
        gfg.put("Practice", "practice.geeksforgeeks.org");
        gfg.put("Code", "code.geeksforgeeks.org");
        gfg.put("Quiz", "quiz.geeksforgeeks.org");
          
        // using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<String,String> entry : gfg.entrySet()){
         
            " IMPORTANT WAY TO GET KEY AND VALUE :- entry.getKey()  &  entry.getValue()"
             
             
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }

Output: 

Key = Quiz, Value = quiz.geeksforgeeks.org
Key = Practice, Value = practice.geeksforgeeks.org
Key = GFG, Value = geeksforgeeks.org
Key = Code, Value = code.geeksforgeeks.org
