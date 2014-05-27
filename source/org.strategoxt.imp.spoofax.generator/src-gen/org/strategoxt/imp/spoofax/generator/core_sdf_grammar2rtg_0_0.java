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

@SuppressWarnings("all") public class core_sdf_grammar2rtg_0_0 extends Strategy 
{ 
  public static core_sdf_grammar2rtg_0_0 instance = new core_sdf_grammar2rtg_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("core_sdf_grammar2rtg_0_0");
    Fail25587:
    { 
      IStrategoTerm m_4239 = null;
      IStrategoTerm n_4239 = null;
      IStrategoTerm o_4239 = null;
      n_4239 = term;
      term = table_create_0_0.instance.invoke(context, generator.const7100);
      if(term == null)
        break Fail25587;
      term = n_4239;
      o_4239 = n_4239;
      term = collect_om_1_0.instance.invoke(context, term, lifted9139.instance);
      if(term == null)
        break Fail25587;
      term = map_1_0.instance.invoke(context, term, lifted9140.instance);
      if(term == null)
        break Fail25587;
      term = concat_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25587;
      IStrategoTerm term10107 = term;
      Success10083:
      { 
        Fail25588:
        { 
          IStrategoTerm p_4239 = null;
          p_4239 = term;
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail25588;
          term = p_4239;
          { 
            IStrategoTerm u_4239 = null;
            u_4239 = term;
            term = fatal_err_msg_0_1.instance.invoke(context, u_4239, generator.const7102);
            if(term == null)
              break Fail25587;
            if(true)
              break Success10083;
          }
        }
        term = term10107;
        m_4239 = term10107;
      }
      term = collect_om_1_0.instance.invoke(context, o_4239, is_start_prod_0_0.instance);
      if(term == null)
        break Fail25587;
      IStrategoTerm term10108 = term;
      Success10084:
      { 
        Fail25589:
        { 
          IStrategoTerm q_4239 = null;
          q_4239 = term;
          if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
            break Fail25589;
          term = q_4239;
          { 
            IStrategoTerm w_4239 = null;
            w_4239 = term;
            term = fatal_err_0_1.instance.invoke(context, w_4239, generator.const7103);
            if(term == null)
              break Fail25587;
            if(true)
              break Success10084;
          }
        }
        term = term10108;
        IStrategoTerm y_4239 = null;
        IStrategoTerm z_4239 = null;
        term = map_1_0.instance.invoke(context, term, lifted9142.instance);
        if(term == null)
          break Fail25587;
        z_4239 = term;
        y_4239 = term;
        term = z_4239;
        if(m_4239 == null)
          break Fail25587;
        term = termFactory.makeAppl(SpoofaxGenerator._consRTG_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consStart_1, new IStrategoTerm[]{y_4239}), termFactory.makeAppl(SpoofaxGenerator._consProdRules_1, new IStrategoTerm[]{m_4239})});
      }
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}