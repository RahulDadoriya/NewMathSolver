package com.example.mathsolver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Calculator extends Activity{
	
	boolean clear_screen = true;
	boolean last_click = false;
	boolean operator_state = false;
	boolean insert_state = false;
	float operand1 = 0f;
	float operand2 =0f;
	float answer = 0f;
	
	String operator = "";
	Button equal,square,cube,root,reciprocal;
	EditText screen;
	
	public void onCreate(Bundle savedInstancestate){
		super.onCreate(savedInstancestate);
	
		setContentView(R.layout.cal_layout);
		equal=(Button)findViewById(R.id.btnequal);
		square=(Button)findViewById(R.id.btnsqr);
		cube=(Button)findViewById(R.id.btncube);
		root=(Button)findViewById(R.id.btnroot);
		reciprocal=(Button)findViewById(R.id.btnreci);
		screen = (EditText) findViewById(R.id.screen);
		
		
		equal.setOnClickListener(new OnClickListener()//        EQUAL
		{

			public void onClick(View v)
			{
				try
				{
				String reg ="((?<=[<=|>=|==|\\+|\\*|\\%|\\^|\\-|<|>|/|=])|(?=[<=|>=|==|\\+|\\*|\\%|\\^|\\-|<|>|/|=]))";
				// TODO Auto-generated method stub
				String inp=screen.getText().toString();
				inp=replacecons(inp);
				inp=sub(inp);
				
				String[] input=inp.split(reg);
				String[] output= expToRPN(input);
				Double result = RPNtoDouble(output);
				screen.setText(String.valueOf(result));
				/*String inp=etinput.getText().toString();
				etoutput.setText(String.valueOf(Math.sin(Double.parseDouble(inp))));*/
				}
				catch(Exception e)
				{
					screen.setText("Invalid Expression");
				}
			}
		});
		reciprocal.setOnClickListener(new OnClickListener()
		{

			@Override
			public void onClick(View v) 
			{
				try
				{
				String reg ="((?<=[<=|>=|==|\\+|\\*|\\%|\\^|\\-|<|>|/|=])|(?=[<=|>=|==|\\+|\\*|\\%|\\^|\\-|<|>|/|=]))";
				String inp=screen.getText().toString();
				inp=replacecons(inp);
				inp=sub(inp);
				
				String[] input=inp.split(reg);
				String[] output= expToRPN(input);
				Double rslt = RPNtoDouble(output);
				Double result= 1/rslt;
				screen.setText(String.valueOf(result));
				}
				catch(Exception e)
				{
					screen.setText("Invalid Expression");
				}
			}
			
		});
		
	}
	// ----------------------------on create ends here-----------------------------------------------
	 //       replace each functions with its value
	public static String sub(String inp)
    {
    	inp=subsin(inp);
		inp=subcos(inp);
		inp=subtan(inp);
		inp=subln(inp);
		inp=sublog(inp);
		inp=subfact(inp);
		
		return inp;
    
    }
	public static long factorial(int n)
	{
		long result=1;
		for(int i=1;i<=n ;i++)
			result=result*i;
		return result;
	}
	public static String replacecons(String inp)
	{
		CharSequence vale=String.valueOf(Math.E);
		CharSequence e="e";
		inp=inp.replace(e, vale);
		return inp;
		
	} 
	// 				FACTORIAL
	public static String subfact(String exp)
	{
		int index=exp.indexOf("!");
		int flag=0,i=index+2;
		if(index!=-1)
		{
			char exparray[]= new char[exp.length()];
			exparray=exp.toCharArray();
			for(i=index+2;i<exp.length();i++)
			{
				if(flag==0 && exparray[i]==')')			break;
				if(exparray[i]=='(')	flag++;
				else if(exparray[i]==')')	flag--;
			}
		
		String reg ="((?<=[<=|>=|==|\\+|\\*|\\%|\\^|\\-|<|>|/|=])|(?=[<=|>=|==|\\+|\\*|\\%|\\^|\\-|<|>|/|=]))";
		String subexp=exp.substring((index+2),(i));
		String[] subexpression=subexp.split(reg);
		String[] output = expToRPN(subexpression);  
		Double rslt = (double)factorial((int)RPNtoDouble( output ));
		CharSequence result=String.valueOf(rslt);
		CharSequence subexpr= exp.substring(index, i+1);
		exp=exp.replace(subexpr,result); //
		}
		return exp;
		
	}
	//------------------------------SIN
	public static String subsin(String exp)
	{
		int index=exp.indexOf("sin");
		int flag=0,i=index+4;
		if(index!=-1)
		{
			char exparray[]= new char[exp.length()];
			exparray=exp.toCharArray();
			for(i=index+4;i<exp.length();i++)
			{
				if(flag==0 && exparray[i]==')')			break;
				if(exparray[i]=='(')	flag++;
				else if(exparray[i]==')')	flag--;
			}
		
		String reg ="((?<=[<=|>=|==|\\+|\\*|\\%|\\^|\\-|<|>|/|=])|(?=[<=|>=|==|\\+|\\*|\\%|\\^|\\-|<|>|/|=]))";
		String subexp=exp.substring((index+4),(i));
		String[] subexpression=subexp.split(reg);
		String[] output = expToRPN(subexpression);  
		Double rslt = Math.sin(RPNtoDouble( output ));
		CharSequence result=String.valueOf(rslt);
		CharSequence subexpr= exp.substring(index, i+1);
		exp=exp.replace(subexpr,result); //
		}
		return exp;
		
	}
	//----------------COS
	public static String subcos(String exp)
	{
		int index=exp.indexOf("cos");
		int flag=0,i=index+4;
		if(index!=-1)
		{
			char exparray[]= new char[exp.length()];
			exparray=exp.toCharArray();
			for(i=index+4;i<exp.length();i++)
			{
				if(flag==0 && exparray[i]==')')			break;
				if(exparray[i]=='(')	flag++;
				else if(exparray[i]==')')	flag--;
			}
		
		String reg ="((?<=[<=|>=|==|\\+|\\*|\\%|\\^|\\-|<|>|/|=])|(?=[<=|>=|==|\\+|\\*|\\%|\\^|\\-|<|>|/|=]))";
		String subexp=exp.substring((index+4),(i));
		String[] subexpression=subexp.split(reg);
		String[] output = expToRPN(subexpression);  
		Double rslt = Math.cos(RPNtoDouble( output ));
		CharSequence result=String.valueOf(rslt);
		CharSequence subexpr= exp.substring(index, i+1);
		exp=exp.replace(subexpr,result); //
		}
		return exp;
		
	}
	//---------------TAN
	public static String subtan(String exp)
	{
		int index=exp.indexOf("tan");
		int flag=0,i=index+4;
		if(index!=-1)
		{
			char exparray[]= new char[exp.length()];
			exparray=exp.toCharArray();
			for(i=index+4;i<exp.length();i++)
			{
				if(flag==0 && exparray[i]==')')			break;
				if(exparray[i]=='(')	flag++;
				else if(exparray[i]==')')	flag--;
			}
		
		String reg ="((?<=[<=|>=|==|\\+|\\*|\\%|\\^|\\-|<|>|/|=])|(?=[<=|>=|==|\\+|\\*|\\%|\\^|\\-|<|>|/|=]))";
		String subexp=exp.substring((index+4),(i));
		String[] subexpression=subexp.split(reg);
		String[] output = expToRPN(subexpression);  
		Double rslt = Math.tan(RPNtoDouble( output ));
		CharSequence result=String.valueOf(rslt);
		CharSequence subexpr= exp.substring(index, i+1);
		exp=exp.replace(subexpr,result); //
		}
		return exp;
		
	}
	//--------------LN
	public static String subln(String exp)
	{
		int index=exp.indexOf("ln");
		int flag=0,i=index+3;
		if(index!=-1)
		{
			char exparray[]= new char[exp.length()];
			exparray=exp.toCharArray();
			for(i=index+3;i<exp.length();i++)
			{
				if(flag==0 && exparray[i]==')')			break;
				if(exparray[i]=='(')	flag++;
				else if(exparray[i]==')')	flag--;
			}
		
		String reg ="((?<=[<=|>=|==|\\+|\\*|\\%|\\^|\\-|<|>|/|=])|(?=[<=|>=|==|\\+|\\*|\\%|\\^|\\-|<|>|/|=]))";
		String subexp=exp.substring((index+3),(i));
		String[] subexpression=subexp.split(reg);
		String[] output = expToRPN(subexpression);  
		Double rslt = Math.log(RPNtoDouble( output ));
		CharSequence result=String.valueOf(rslt);
		CharSequence subexpr= exp.substring(index, i+1);
		exp=exp.replace(subexpr,result); //
		}
		return exp;
		
	}
	//--------------LOG
	public static String sublog(String exp)
	{
			int index=exp.indexOf("log");
			int flag=0,i=index+4;
			if(index!=-1)
			{
				char exparray[]= new char[exp.length()];
				exparray=exp.toCharArray();
				for(i=index+4;i<exp.length();i++)
				{
					if(flag==0 && exparray[i]==')')			break;
					if(exparray[i]=='(')	flag++;
					else if(exparray[i]==')')	flag--;
				}
			
			String reg ="((?<=[<=|>=|==|\\+|\\*|\\%|\\^|\\-|<|>|/|=])|(?=[<=|>=|==|\\+|\\*|\\%|\\^|\\-|<|>|/|=]))";
			String subexp=exp.substring((index+4),(i));
			String[] subexpression=subexp.split(reg);
			String[] output = expToRPN(subexpression);  
			Double rslt = Math.log(RPNtoDouble( output ))/Math.log(10);
			CharSequence result=String.valueOf(rslt);
			CharSequence subexpr= exp.substring(index, i+1);
			exp=exp.replace(subexpr,result); //
			}
			return exp;
			
	}
	// code for expression solving calculator starts from here
	
	private static final int LEFT_ASSOC  = 0;  
	private static final int RIGHT_ASSOC = 1;  
	// Operators  
	private static final Map<String, int[]> OPERATORS = new HashMap<String, int[]>();  
	static   
	{  
	    // Map<"token", []{precedence, associativity}>  
	    OPERATORS.put("+", new int[] { 0, LEFT_ASSOC });  
	    OPERATORS.put("-", new int[] { 0, LEFT_ASSOC });  
	    OPERATORS.put("*", new int[] { 5, LEFT_ASSOC });  
	    OPERATORS.put("/", new int[] { 5, LEFT_ASSOC });
	    OPERATORS.put("^", new int[] { 7, LEFT_ASSOC });
	    OPERATORS.put("%", new int[] { 6, LEFT_ASSOC });
	}  

	// Test if token is an operator  
	private static boolean isOperator(String token)   
	{  
	    return OPERATORS.containsKey(token);  
	}  

	// Test associativity of operator token  
	private static boolean isAssociative(String token, int type)   
	{  
	    if (!isOperator(token))   
	    {  
	        throw new IllegalArgumentException("Invalid token: " + token);  
	    }  

	    if (OPERATORS.get(token)[1] == type) {  
	        return true;  
	    }  
	    return false;  
	}  

	// Compare precedence of operators.      
	private static final int cmpPrecedence(String token1, String token2)   
	{  
	    if (!isOperator(token1) || !isOperator(token2))   
	    {  
	        throw new IllegalArgumentException("Invalid tokens: " + token1  
	                + " " + token2);  
	    }  
	    return OPERATORS.get(token1)[0] - OPERATORS.get(token2)[0];  
	}  

	// Convert infix expression format into reverse Polish notation  
	public static String[] expToRPN(String[] inputTokens)   
	{  
	    ArrayList<String> out = new ArrayList<String>();  
	    Stack<String> stack = new Stack<String>();  

	    // For each token  
	    for (String token : inputTokens)   
	    {  
	        // If token is an operator  
	        if (isOperator(token))   
	        {    
	            // While stack not empty AND stack top element   
	            // is an operator  
	            while (!stack.empty() && isOperator(stack.peek()))   
	            {                      
	                if ((isAssociative(token, LEFT_ASSOC)         && 
	                     cmpPrecedence(token, stack.peek()) <= 0) ||   
	                    (isAssociative(token, RIGHT_ASSOC)        &&   
	                     cmpPrecedence(token, stack.peek()) < 0))   
	                {  
	                    out.add(stack.pop());     
	                    continue;  
	                }  
	                break;  
	            }
	            // Push the new operator on the stack  
	            stack.push(token);  
	        }   
	        // If token is a left bracket '('  
	        else if (token.equals("("))   
	        {  
	            stack.push(token);  //   
	        }   
	        // If token is a right bracket ')'  
	        else if (token.equals(")"))   
	        {                  
	            while (!stack.empty() && !stack.peek().equals("("))   
	            {  
	                out.add(stack.pop());   
	            }  
	            stack.pop();   
	        }   
	        // If token is a number  
	        else   
	        {  
	        //  if(!isOperator(stack.peek())){
	        //      out.add(String.valueOf(token*10));
	        //      }
	            out.add(token);   
	        }  
	    }  
	    while (!stack.empty())  
	    {  
	        out.add(stack.pop());   
	    }  
	    String[] output = new String[out.size()];  
	    return out.toArray(output);  
	}  

	public static double RPNtoDouble(String[] tokens)  
	{          
	    Stack<String> stack = new Stack<String>();  

	    // For each token   
	    for (String token : tokens) //for each   
	    {  
	        // If the token is a value push it onto the stack  
	        if (!isOperator(token))   
	        {  
	            stack.push(token);                  
	        }  
	        else  
	        {          
	            // Token is an operator: pop top two entries  
	            Double d2 = Double.valueOf( stack.pop() );  
	            Double d1 = Double.valueOf( stack.pop() );  

	            //Get the result  
	            Double result = token.compareTo("^") == 0 ? Math.pow(d1, d2) :
	            				token.compareTo("%") == 0 ? d1 % d2:
	            				token.compareTo("*") == 0 ? d1 * d2 : 
	                            token.compareTo("/") == 0 ? d1 / d2 :  
	                            token.compareTo("+") == 0 ? d1 + d2 :  
	                                                        d1 - d2;                 
	          // Push result onto stack  
	            stack.push( String.valueOf( result ));                                                  
	        }                          
	    }          

	    return Double.valueOf(stack.pop());  
	}

	
	// code for expression solving calculator ends here.
	
	public void insert_state(String text)
	{
		
		
		if (this.clear_screen)
		{
			screen.setText("");
			this.clear_screen = false; 
		}
		this.insert_state = true;
		this.last_click = true;
		screen.append(text);
		
	}
	public void Button_click(View v)
	{
		
		switch (v.getId())
		{
			
		case R.id.btn0 :
			insert_state("0");
			break ;
			
		case R.id.btn1 :
			insert_state("1");
			break ;
			
		case R.id.btn2 :
			insert_state("2");
			break ;
			
		case R.id.btn3 :
			insert_state("3");
			break ;
			
		case R.id.btn4 :
			insert_state("4");
			break ;	
			
		case R.id.btn5 :
			insert_state("5");
			break ;
			
		case R.id.btn6 :
			insert_state("6");
			break ;
			
		case R.id.btn7 :
			insert_state("7");
			break ;
			
		case R.id.btn8 :
			insert_state("8");
			break ;
			
		case R.id.btn9 :
			insert_state("9");
			break ;
			
		case R.id.btnexponent:
			insert_state("e");
			break;
			
		case R.id.btndecimal :
			insert_state(".");
			break ;

		case R.id.btnadd :
			insert_state("+");
			break ;
			
		case R.id.btnsub :
			insert_state("-");
			break ;
			
		case R.id.btnmulti :
			insert_state("*");
			break ;
			
		case R.id.btndivide :
			insert_state("/");
			break ;
			
		case R.id.btnpower :
			insert_state("^");
			break;
			
		case R.id.btnpercentage :
			insert_state("%");
			break;
			
		case R.id.btnsin :
			insert_state("sin(");
			break;
		
		case R.id.btncos :
			insert_state("cos(");
			break;
		
		case R.id.btntan :
			insert_state("tan(");
			break;
		
		case R.id.btnln :
			insert_state("ln(");
			break;
		
		case R.id.btnlog :
			insert_state("log(");
			break;
			
		case R.id.btnsqr:
			insert_state("^2");
			break;
		
		case R.id.btncube:
			insert_state("^3");
			break;
			
		case R.id.btnroot:
			insert_state("^0.5");
			break;
		
		case R.id.btnopenbrace:
			insert_state(")");
			break;
			
		case R.id.btnclosebrace:
			insert_state(")");
			break;
			
		case R.id.btnfactorial:
			insert_state("!(");
			break;
			
		case R.id.btnclear :
			if (screen.getText().toString().length() > 1)
			{
				String screen_new = screen.getText().toString().substring(0, screen.getText().toString().length() - 1);
				screen.setText(screen_new);
				this.clear_screen = false;
			}
			else 
			{
				screen.setText("0");
				this.clear_screen = true;
			}
			break;
			
		case R.id.btncls :
			this.insert_state = false;
			this.last_click = false;
			this.clear_screen = true;
			screen.setText("0");
			break ;
		}	
	}
}
