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

@SuppressWarnings("all") public class fetch_up_with_position_2_1 extends Strategy 
{ 
  public static fetch_up_with_position_2_1 instance = new fetch_up_with_position_2_1();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy o_4344, Strategy p_4344, IStrategoTerm q_4344)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("fetch_up_with_position_2_1");
    Fail21227:
    { 
      IStrategoTerm term11406 = term;
      Success11406:
      { 
        Fail21228:
        { 
          IStrategoTerm x_4160 = null;
          IStrategoTerm y_4160 = null;
          IStrategoTerm a_4161 = null;
          IStrategoTerm b_4161 = null;
          IStrategoTerm f_4161 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail21228;
          x_4160 = term.getSubterm(0);
          y_4160 = term.getSubterm(1);
          term = x_4160;
          IStrategoTerm term11407 = term;
          Success11407:
          { 
            Fail21229:
            { 
              term = o_4344.invoke(context, term);
              if(term == null)
                break Fail21229;
              { 
                if(true)
                  break Fail21228;
                if(true)
                  break Success11407;
              }
            }
            term = term11407;
          }
          term = x_4160;
          IStrategoTerm term11408 = term;
          Success11408:
          { 
            Fail21230:
            { 
              term = p_4344.invoke(context, term);
              if(term == null)
                break Fail21230;
              { 
                if(true)
                  break Fail21228;
                if(true)
                  break Success11408;
              }
            }
            term = term11408;
          }
          term = parent_at_position_0_1.instance.invoke(context, q_4344, y_4160);
          if(term == null)
            break Fail21228;
          f_4161 = term;
          term = init_0_0.instance.invoke(context, y_4160);
          if(term == null)
            break Fail21228;
          term = termFactory.makeTuple(f_4161, term);
          term = this.invoke(context, term, o_4344, p_4344, q_4344);
          if(term == null)
            break Fail21228;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail21228;
          a_4161 = term.getSubterm(0);
          b_4161 = term.getSubterm(1);
          term = termFactory.makeTuple(a_4161, b_4161);
          if(true)
            break Success11406;
        }
        term = term11406;
        IStrategoTerm r_4160 = null;
        IStrategoTerm s_4160 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail21227;
        s_4160 = term.getSubterm(0);
        r_4160 = term.getSubterm(1);
        term = o_4344.invoke(context, s_4160);
        if(term == null)
          break Fail21227;
        term = termFactory.makeTuple(s_4160, r_4160);
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}