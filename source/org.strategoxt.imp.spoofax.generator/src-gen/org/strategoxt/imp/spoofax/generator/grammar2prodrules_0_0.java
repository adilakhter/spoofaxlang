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

@SuppressWarnings("all") public class grammar2prodrules_0_0 extends Strategy 
{ 
  public static grammar2prodrules_0_0 instance = new grammar2prodrules_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("grammar2prodrules_0_0");
    Fail25590:
    { 
      IStrategoTerm term10110 = term;
      IStrategoConstructor cons329 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success10085:
      { 
        if(cons329 == SpoofaxGenerator._conssyntax_1)
        { 
          Fail25591:
          { 
            IStrategoTerm e_4240 = null;
            e_4240 = term.getSubterm(0);
            term = remove_all_1_0.instance.invoke(context, e_4240, ignore_prod_0_0.instance);
            if(term == null)
              break Fail25591;
            term = map_1_0.instance.invoke(context, term, lifted9145.instance);
            if(term == null)
              break Fail25591;
            term = remove_all_1_0.instance.invoke(context, term, lifted9147.instance);
            if(term == null)
              break Fail25591;
            if(true)
              break Success10085;
          }
          term = term10110;
        }
        Success10086:
        { 
          if(cons329 == SpoofaxGenerator._conscontext_free_syntax_1)
          { 
            Fail25592:
            { 
              IStrategoTerm d_4240 = null;
              d_4240 = term;
              term = fatal_err_0_1.instance.invoke(context, d_4240, generator.const7106);
              if(term == null)
                break Fail25592;
              if(true)
                break Success10086;
            }
            term = term10110;
          }
          if(cons329 == SpoofaxGenerator._conslexical_syntax_1)
          { 
            IStrategoTerm b_4240 = null;
            b_4240 = term;
            term = fatal_err_0_1.instance.invoke(context, b_4240, generator.const7107);
            if(term == null)
              break Fail25590;
          }
          else
          { 
            break Fail25590;
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