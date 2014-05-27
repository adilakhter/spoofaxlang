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

@SuppressWarnings("all") public class insert_at_index_0_2 extends Strategy 
{ 
  public static insert_at_index_0_2 instance = new insert_at_index_0_2();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, IStrategoTerm t_4344, IStrategoTerm u_4344)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("insert_at_index_0_2");
    Fail21274:
    { 
      IStrategoTerm term11435 = term;
      Success11434:
      { 
        Fail21275:
        { 
          IStrategoTerm c_4168 = null;
          IStrategoTerm f_4168 = null;
          c_4168 = term;
          term = u_4344;
          IStrategoTerm term11436 = term;
          Success11435:
          { 
            Fail21276:
            { 
              term = is_list_0_0.instance.invoke(context, term);
              if(term == null)
                break Fail21276;
              { 
                if(true)
                  break Fail21275;
                if(true)
                  break Success11435;
              }
            }
            term = term11436;
          }
          f_4168 = c_4168;
          term = (IStrategoTerm)termFactory.makeListCons(u_4344, (IStrategoList)trans.constNil3);
          term = this.invoke(context, f_4168, t_4344, term);
          if(term == null)
            break Fail21275;
          if(true)
            break Success11434;
        }
        term = term11435;
        IStrategoTerm v_4167 = null;
        IStrategoTerm w_4167 = null;
        IStrategoTerm x_4167 = null;
        v_4167 = term;
        term = split_at_0_1.instance.invoke(context, v_4167, t_4344);
        if(term == null)
          break Fail21274;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail21274;
        w_4167 = term.getSubterm(0);
        x_4167 = term.getSubterm(1);
        term = (IStrategoTerm)termFactory.makeListCons(w_4167, termFactory.makeListCons(u_4344, termFactory.makeListCons(x_4167, (IStrategoList)trans.constNil3)));
        term = concat_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail21274;
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}