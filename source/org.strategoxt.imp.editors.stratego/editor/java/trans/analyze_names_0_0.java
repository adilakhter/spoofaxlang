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

@SuppressWarnings("all") public class analyze_names_0_0 extends Strategy 
{ 
  public static analyze_names_0_0 instance = new analyze_names_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("analyze_names_0_0");
    Fail21332:
    { 
      IStrategoTerm h_4178 = null;
      IStrategoTerm i_4178 = null;
      IStrategoTerm j_4178 = null;
      IStrategoTerm k_4178 = null;
      IStrategoTerm q_4178 = null;
      IStrategoTerm r_4178 = null;
      IStrategoTerm t_4178 = null;
      IStrategoTerm u_4178 = null;
      IStrategoTerm v_4178 = null;
      IStrategoTerm m_4178 = null;
      IStrategoTerm n_4178 = null;
      IStrategoTerm y_4178 = null;
      IStrategoTerm z_4178 = null;
      IStrategoTerm b_4179 = null;
      IStrategoTerm c_4179 = null;
      IStrategoTerm d_4179 = null;
      h_4178 = term;
      j_4178 = term;
      term = trans.const4262;
      k_4178 = trans.const4262;
      t_4178 = term;
      q_4178 = trans.const4263;
      u_4178 = t_4178;
      r_4178 = trans.constCons1966;
      v_4178 = u_4178;
      term = termFactory.makeTuple(trans.const4264, k_4178);
      term = dr_set_rule_0_3.instance.invoke(context, v_4178, q_4178, r_4178, term);
      if(term == null)
        break Fail21332;
      term = j_4178;
      m_4178 = j_4178;
      term = project_path_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21332;
      n_4178 = term;
      b_4179 = term;
      y_4178 = trans.const4265;
      c_4179 = b_4179;
      z_4178 = trans.constCons1966;
      d_4179 = c_4179;
      term = termFactory.makeTuple(trans.const4266, n_4178);
      term = dr_set_rule_0_3.instance.invoke(context, d_4179, y_4178, z_4178, term);
      if(term == null)
        break Fail21332;
      term = try_1_0.instance.invoke(context, m_4178, get_source_base_dir_0_0.instance);
      if(term == null)
        break Fail21332;
      term = map_1_0.instance.invoke(context, h_4178, basic_desugar_top_0_0.instance);
      if(term == null)
        break Fail21332;
      i_4178 = term;
      term = declare_globals_0_0.instance.invoke(context, trans.constImport0);
      if(term == null)
        break Fail21332;
      term = ensure_imports_0_0.instance.invoke(context, i_4178);
      if(term == null)
        break Fail21332;
      term = analyze_names_in_asts_0_0.instance.invoke(context, i_4178);
      if(term == null)
        break Fail21332;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}