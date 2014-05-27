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

@SuppressWarnings("all") public class get_changed_asts_0_0 extends Strategy 
{ 
  public static get_changed_asts_0_0 instance = new get_changed_asts_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("get_changed_asts_0_0");
    Fail21381:
    { 
      IStrategoTerm term11504 = term;
      Success11470:
      { 
        Fail21382:
        { 
          IStrategoTerm s_4188 = null;
          IStrategoTerm t_4188 = null;
          IStrategoTerm w_4188 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail21382;
          s_4188 = term.getSubterm(0);
          t_4188 = term.getSubterm(1);
          term = topdown_1_0.instance.invoke(context, s_4188, strip_annos_0_0.instance);
          if(term == null)
            break Fail21382;
          w_4188 = term;
          term = topdown_1_0.instance.invoke(context, t_4188, strip_annos_0_0.instance);
          if(term == null)
            break Fail21382;
          term = termFactory.makeTuple(w_4188, term);
          term = zip_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21382;
          term = filter_1_0.instance.invoke(context, term, lifted6521.instance);
          if(term == null)
            break Fail21382;
          if(true)
            break Success11470;
        }
        term = term11504;
        IStrategoTerm p_4188 = null;
        IStrategoTerm q_4188 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail21381;
        p_4188 = term.getSubterm(0);
        q_4188 = term.getSubterm(1);
        term = p_4188;
        IStrategoTerm term11506 = term;
        Success11471:
        { 
          Fail21383:
          { 
            term = is_list_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail21383;
            { 
              if(true)
                break Fail21381;
              if(true)
                break Success11471;
            }
          }
          term = term11506;
        }
        term = q_4188;
        IStrategoTerm term11507 = term;
        Success11472:
        { 
          Fail21384:
          { 
            term = is_list_0_0.instance.invoke(context, term);
            if(term == null)
              break Fail21384;
            { 
              if(true)
                break Fail21381;
              if(true)
                break Success11472;
            }
          }
          term = term11507;
        }
        term = termFactory.makeTuple((IStrategoTerm)termFactory.makeListCons(p_4188, (IStrategoList)trans.constNil3), (IStrategoTerm)termFactory.makeListCons(q_4188, (IStrategoList)trans.constNil3));
        term = this.invoke(context, term);
        if(term == null)
          break Fail21381;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}