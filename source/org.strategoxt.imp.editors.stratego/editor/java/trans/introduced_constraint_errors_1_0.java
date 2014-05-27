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

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy s_4898)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("introduced_constraint_errors_1_0");
    Fail22846:
    { 
      IStrategoTerm term12209 = term;
      Success12175:
      { 
        Fail22847:
        { 
          IStrategoTerm d_4740 = null;
          IStrategoTerm e_4740 = null;
          IStrategoTerm h_4740 = null;
          IStrategoTerm i_4740 = null;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail22847;
          d_4740 = term.getSubterm(0);
          e_4740 = term.getSubterm(1);
          term = termFactory.makeTuple(d_4740, e_4740);
          term = zip_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22847;
          lifted6781 lifted67810 = new lifted6781();
          lifted67810.s_4898 = s_4898;
          term = map_1_0.instance.invoke(context, term, lifted67810);
          if(term == null)
            break Fail22847;
          term = unzip_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22847;
          term = SRTS_all.instance.invoke(context, term, flatten_list_0_0.instance);
          if(term == null)
            break Fail22847;
          if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
            break Fail22847;
          h_4740 = term.getSubterm(0);
          i_4740 = term.getSubterm(1);
          term = termFactory.makeTuple(h_4740, i_4740);
          if(true)
            break Success12175;
        }
        term = term12209;
        IStrategoTerm t_4739 = null;
        IStrategoTerm u_4739 = null;
        IStrategoTerm v_4739 = null;
        IStrategoTerm w_4739 = null;
        IStrategoTerm x_4739 = null;
        IStrategoTerm y_4739 = null;
        IStrategoTerm z_4739 = null;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail22846;
        t_4739 = term.getSubterm(0);
        u_4739 = term.getSubterm(1);
        term = s_4898.invoke(context, t_4739);
        if(term == null)
          break Fail22846;
        term = topdown_1_0.instance.invoke(context, term, strip_annos_0_0.instance);
        if(term == null)
          break Fail22846;
        term = SRTS_all.instance.invoke(context, term, make_set_0_0.instance);
        if(term == null)
          break Fail22846;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail22846;
        w_4739 = term.getSubterm(0);
        z_4739 = term.getSubterm(1);
        term = s_4898.invoke(context, u_4739);
        if(term == null)
          break Fail22846;
        term = topdown_1_0.instance.invoke(context, term, strip_annos_0_0.instance);
        if(term == null)
          break Fail22846;
        term = SRTS_all.instance.invoke(context, term, make_set_0_0.instance);
        if(term == null)
          break Fail22846;
        if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 2)
          break Fail22846;
        v_4739 = term.getSubterm(0);
        y_4739 = term.getSubterm(1);
        term = termFactory.makeTuple(v_4739, w_4739);
        term = diff_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail22846;
        x_4739 = term;
        term = termFactory.makeTuple(y_4739, z_4739);
        term = diff_0_0.instance.invoke(context, term);
        if(term == null)
          break Fail22846;
        term = termFactory.makeTuple(x_4739, term);
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}