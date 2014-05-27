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

@SuppressWarnings("all") public class introduced_constraint_errors_1_0 extends Strategy 
{ 
  public static introduced_constraint_errors_1_0 instance = new introduced_constraint_errors_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy a_4345)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("introduced_constraint_errors_1_0");
    Fail21370:
    { 
      IStrategoTerm term11500 = term;
      Success11466:
      { 
        Fail21371:
        { 
          IStrategoTerm l_4186 = null;
          IStrategoTerm m_4186 = null;
          IStrategoTerm p_4186 = null;
          IStrategoTerm q_4186 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail21371;
          l_4186 = term.getSubterm(0);
          m_4186 = term.getSubterm(1);
          term = termFactory.makeTuple(l_4186, m_4186);
          term = zip_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21371;
          lifted6510 lifted65100 = new lifted6510();
          lifted65100.a_4345 = a_4345;
          term = map_1_0.instance.invoke(context, term, lifted65100);
          if(term == null)
            break Fail21371;
          term = unzip_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21371;
          term = SRTS_all.instance.invoke(context, term, flatten_list_0_0.instance);
          if(term == null)
            break Fail21371;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail21371;
          p_4186 = term.getSubterm(0);
          q_4186 = term.getSubterm(1);
          term = termFactory.makeTuple(p_4186, q_4186);
          if(true)
            break Success11466;
        }
        term = term11500;
        IStrategoTerm b_4186 = null;
        IStrategoTerm c_4186 = null;
        IStrategoTerm d_4186 = null;
        IStrategoTerm e_4186 = null;
        IStrategoTerm f_4186 = null;
        IStrategoTerm g_4186 = null;
        IStrategoTerm h_4186 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail21370;
        b_4186 = term.getSubterm(0);
        c_4186 = term.getSubterm(1);
        term = a_4345.invoke(context, b_4186);
        if(term == null)
          break Fail21370;
        term = topdown_1_0.instance.invoke(context, term, strip_annos_0_0.instance);
        if(term == null)
          break Fail21370;
        term = SRTS_all.instance.invoke(context, term, make_set_0_0.instance);
        if(term == null)
          break Fail21370;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail21370;
        e_4186 = term.getSubterm(0);
        h_4186 = term.getSubterm(1);
        term = a_4345.invoke(context, c_4186);
        if(term == null)
          break Fail21370;
        term = topdown_1_0.instance.invoke(context, term, strip_annos_0_0.instance);
        if(term == null)
          break Fail21370;
        term = SRTS_all.instance.invoke(context, term, make_set_0_0.instance);
        if(term == null)
          break Fail21370;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail21370;
        d_4186 = term.getSubterm(0);
        g_4186 = term.getSubterm(1);
        term = termFactory.makeTuple(d_4186, e_4186);
        term = diff_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail21370;
        f_4186 = term;
        term = termFactory.makeTuple(g_4186, h_4186);
        term = diff_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail21370;
        term = termFactory.makeTuple(f_4186, term);
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}