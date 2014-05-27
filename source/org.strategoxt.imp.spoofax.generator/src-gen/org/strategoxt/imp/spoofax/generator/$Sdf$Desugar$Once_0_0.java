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

@SuppressWarnings("all") public class $Sdf$Desugar$Once_0_0 extends Strategy 
{ 
  public static $Sdf$Desugar$Once_0_0 instance = new $Sdf$Desugar$Once_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("SdfDesugarOnce_0_0");
    Fail25456:
    { 
      IStrategoTerm term10038 = term;
      Success10036:
      { 
        Fail25457:
        { 
          term = alltd_1_0.instance.invoke(context, term, $Ensure$Quotes_0_0.instance);
          if(term == null)
            break Fail25457;
          term = term_1_0.instance.invoke(context, term, implode_aterm_0_0.instance);
          if(term == null)
            break Fail25457;
          if(true)
            break Success10036;
        }
        term = term10038;
        IStrategoTerm term10039 = term;
        IStrategoConstructor cons327 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
        Success10037:
        { 
          if(cons327 == SpoofaxGenerator._conslit_1)
          { 
            Fail25458:
            { 
              IStrategoTerm h_4220 = null;
              h_4220 = term.getSubterm(0);
              term = un_double_quote_0_0.instance.invoke(context, h_4220);
              if(term == null)
                break Fail25458;
              term = termFactory.makeAppl(SpoofaxGenerator._conslit_1, new IStrategoTerm[]{term});
              if(true)
                break Success10037;
            }
            term = term10039;
          }
          if(cons327 == SpoofaxGenerator._consci_lit_1)
          { 
            IStrategoTerm e_4220 = null;
            e_4220 = term.getSubterm(0);
            term = un_single_quote_0_0.instance.invoke(context, e_4220);
            if(term == null)
              break Fail25456;
            term = termFactory.makeAppl(SpoofaxGenerator._consci_lit_1, new IStrategoTerm[]{term});
          }
          else
          { 
            break Fail25456;
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