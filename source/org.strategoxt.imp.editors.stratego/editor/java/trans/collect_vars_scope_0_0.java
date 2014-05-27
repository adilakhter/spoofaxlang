package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.strc.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.stratego.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class collect_vars_scope_0_0 extends Strategy 
{ 
  public static collect_vars_scope_0_0 instance = new collect_vars_scope_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("collect_vars_scope_0_0");
    Fail22789:
    { 
      IStrategoTerm term12164 = term;
      IStrategoConstructor cons585 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success12160:
      { 
        if(cons585 == Main._consScope_2)
        { 
          Fail22790:
          { 
            IStrategoTerm d_4727 = null;
            IStrategoTerm e_4727 = null;
            e_4727 = term.getSubterm(0);
            d_4727 = term.getSubterm(1);
            term = collect_vars_0_0.instance.invoke(context, d_4727);
            if(term == null)
              break Fail22790;
            term = termFactory.makeTuple(term, e_4727);
            term = diff_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail22790;
            if(true)
              break Success12160;
          }
          term = term12164;
        }
        if(cons585 == Main._consLRule_1)
        { 
          IStrategoTerm w_4726 = null;
          IStrategoTerm x_4726 = null;
          IStrategoTerm y_4726 = null;
          IStrategoTerm arg8102 = term.getSubterm(0);
          w_4726 = arg8102;
          if(arg8102.getTermType() != IStrategoTerm.APPL || Main._consRule_3 != ((IStrategoAppl)arg8102).getConstructor())
            break Fail22789;
          x_4726 = arg8102.getSubterm(0);
          term = collect_all_1_0.instance.invoke(context, x_4726, lifted6736.instance);
          if(term == null)
            break Fail22789;
          y_4726 = term;
          term = collect_vars_0_0.instance.invoke(context, w_4726);
          if(term == null)
            break Fail22789;
          term = termFactory.makeTuple(term, y_4726);
          term = diff_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22789;
        }
        else
        { 
          break Fail22789;
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