package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.strc.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.stratego_sdf.*;
import org.strategoxt.java_front.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class generate_rtg_0_0 extends Strategy 
{ 
  public static generate_rtg_0_0 instance = new generate_rtg_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("generate_rtg_0_0");
    Fail76086:
    { 
      IStrategoTerm m_92074 = null;
      IStrategoTerm n_92074 = null;
      IStrategoTerm o_92074 = null;
      IStrategoTerm q_92074 = null;
      IStrategoTerm r_92074 = null;
      if(term.getTermType() != IStrategoTerm.TUPLE || term.getSubtermCount() != 5)
        break Fail76086;
      o_92074 = term.getSubterm(0);
      m_92074 = term.getSubterm(3);
      r_92074 = term;
      IStrategoTerm term41875 = term;
      Success41795:
      { 
        Fail76087:
        { 
          IStrategoTerm t_92074 = null;
          t_92074 = m_92074;
          term = guarantee_extension_0_1.instance.invoke(context, t_92074, trans.const15572);
          if(term == null)
            break Fail76087;
          n_92074 = term;
          term = debug_1_0.instance.invoke(context, o_92074, lifted21574.instance);
          if(term == null)
            break Fail76087;
          term = add_context_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail76087;
          term = debug_1_0.instance.invoke(context, term, lifted21575.instance);
          if(term == null)
            break Fail76087;
          term = sdf_desugar_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail76087;
          term = debug_1_0.instance.invoke(context, term, lifted21576.instance);
          if(term == null)
            break Fail76087;
          term = core_rtg2sig_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail76087;
          term = debug_1_0.instance.invoke(context, term, lifted21577.instance);
          if(term == null)
            break Fail76087;
          term = pp_stratego_string_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail76087;
          q_92074 = term;
          if(true)
            break Success41795;
        }
        term = term41875;
        IStrategoTerm v_92074 = null;
        v_92074 = term;
        term = concat_strings_0_0.instance.invoke(context, trans.constCons7227);
        if(term == null)
          break Fail76086;
        term = termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11));
        term = fatal_err_msg_0_1.instance.invoke(context, v_92074, term);
        if(term == null)
          break Fail76086;
      }
      term = r_92074;
      if(n_92074 == null || q_92074 == null)
        break Fail76086;
      term = termFactory.makeTuple(n_92074, q_92074);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}