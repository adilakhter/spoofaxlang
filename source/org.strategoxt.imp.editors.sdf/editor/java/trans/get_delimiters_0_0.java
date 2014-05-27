package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class get_delimiters_0_0 extends Strategy 
{ 
  public static get_delimiters_0_0 instance = new get_delimiters_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("get_delimiters_0_0");
    Fail75775:
    { 
      Success41508:
      { 
        Fail75776:
        { 
          IStrategoTerm z_92030 = null;
          z_92030 = term;
          term = SRTS_one.instance.invoke(context, term, lifted21526.instance);
          if(term == null)
            break Fail75776;
          term = z_92030;
          { 
            term = trans.const15500;
            if(true)
              break Success41508;
          }
        }
        term = trans.const15503;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}