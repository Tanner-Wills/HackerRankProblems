package AmazonOA;

public class RegEx {

    /*
    PROBLEM:
     given a list of strings made up of the characters 'a' and 'b', create a regular expression
     that will match strings that begin and end with the same letter.
     example:'a', 'aa', and 'bababbb' match
     'ab' and 'baba' do not match

    SOLUTION:
     regularExpression = '^[ab]$|^aa$|^bb$|^a.*a$|^b.*b$'
     must start with ^ and end with $

    SOLUTION:
     regularExpression = '^[ab]$|^([ab]).*\\1$'
     pattern = complie(regularExpression)

    QUICK REFERENCE:
     positive lookahead: (?*...)
     Negative Lookahead: (?!...)
     Positive Lookbehind: (?<=...)
     Negative Lookbehind: (?<!...)

    */

}
