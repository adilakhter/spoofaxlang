package org.strategoxt.imp.spoofax.generator;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_rtg.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.stratego_tool_doc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class is_list_term_0_0 extends Strategy 
{ 
  public static is_list_term_0_0 instance = new is_list_term_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("is_list_term_0_0");
    Fail26309:
    { 
      IStrategoTerm term10653 = term;
      Success10557:
      { 
        Fail26310:
        { 
          term = $Conc$Term_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail26310;
          if(true)
            break Success10557;
        }
        term = term10653;
        IStrategoTerm term10654 = term;
        Success10558:
        { 
          Fail26311:
          { 
            term = $Cons$Term_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail26311;
            if(true)
              break Success10558;
          }
          term = term10654;
          IStrategoTerm term10655 = term;
          Success10559:
          { 
            Fail26312:
            { 
              term = $Nil$Term_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail26312;
              if(true)
                break Success10559;
            }
            term = $Tuple$Term_1_0.instance.invoke(context, term10655, _Id.instance);
            if(term == null)
              break Fail26309;
          }
        }
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}