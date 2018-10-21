package hello;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class WordController {
    // TODO Implement the /words/{word} endpoint
    
    @RequestMapping("/words/{word}")
	public Palindrome getPaindrome(@RequestParam(value="word", required=true) String word) {
		int n = word.length();
		String a = "" , b = "";
		boolean res = false;
		Palindrome p = new Palindrome();
        for(int i = n - 1; i >= 0; i--)
        {
            b = b + a.charAt(i);
        }
        p.setWord(word);
        if(a.equalsIgnoreCase(b))
        {
        	res = true;
        }
        else
        {
        	res = false;
        }
        p.setPalindrome(res);
        p.setAnagramOfPalindrome(false);
        
        return p;
	}
    
}
