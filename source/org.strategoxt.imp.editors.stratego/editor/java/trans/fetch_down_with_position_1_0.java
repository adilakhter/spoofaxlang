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

@SuppressWarnings("all") public class fetch_down_with_position_1_0 extends Strategy 
{ 
  public static fetch_down_with_position_1_0 instance = new fetch_down_with_position_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_4344)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fetch_down_with_position_1_0");
    Fail21232:
    { 
      IStrategoTerm term11409 = term;
      Success11409:
      { 
        Fail21233:
        { 
          IStrategoTerm r_4161 = null;
          IStrategoTerm s_4161 = null;
          IStrategoTerm t_4161 = null;
          IStrategoTerm u_4161 = null;
          IStrategoTerm v_4161 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail21233;
          r_4161 = term.getSubterm(0);
          t_4161 = term.getSubterm(1);
          term = r_4161;
          IStrategoTerm term11410 = term;
          Success11410:
          { 
            Fail21234:
            { 
              term = r_4344.invoke(context, term);
              if(term == null)
                break Fail21234;
              { 
                if(true)
                  break Fail21233;
                if(true)
                  break Success11410;
              }
            }
            term = term11410;
          }
          term = get_arguments_0_0.instance.invoke(context, r_4161);
          if(term == null)
            break Fail21233;
          if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
            break Fail21233;
          s_4161 = ((IStrategoList)term).head();
          IStrategoTerm arg7491 = ((IStrategoList)term).tail();
          if(arg7491.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7491).isEmpty())
            break Fail21233;
          term = termFactory.makeTuple(t_4161, trans.constCons1962);
          term = conc_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21233;
          term = termFactory.makeTuple(s_4161, term);
          term = this.invoke(context, term, r_4344);
          if(term == null)
            break Fail21233;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail21233;
          u_4161 = term.getSubterm(0);
          v_4161 = term.getSubterm(1);
          term = termFactory.makeTuple(u_4161, v_4161);
          if(true)
            break Success11409;
        }
        term = term11409;
        IStrategoTerm n_4161 = null;
        IStrategoTerm o_4161 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail21232;
        o_4161 = term.getSubterm(0);
        n_4161 = term.getSubterm(1);
        term = r_4344.invoke(context, o_4161);
        if(term == null)
          break Fail21232;
        term = termFactory.makeTuple(o_4161, n_4161);
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}