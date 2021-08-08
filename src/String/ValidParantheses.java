package String;

import java.util.Stack;

public class ValidParantheses {
    public boolean isValid(String s) {
        Stack stk = new Stack();
        for(char ch: s.toCharArray())
        {
            if(ch == '('  || ch == '{' || ch == '[')
                stk.push(ch);
            else
            {
                if(stk.isEmpty()) return false;
                if(!eval(ch, (Character) stk.pop()))
                {
                    return false;
                }
            }

        }

        if(!stk.isEmpty())
            return false;

        return true;

    }

    private boolean eval (char ch, char stk)
    {
        if ( stk == '(' && ch == ')')
            return true;
        if ( stk == '{' && ch == '}')
            return true;
        if ( stk == '[' && ch == ']')
            return true;

        return false;
    }
}

