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
    Fail22808:
    { 
      IStrategoTerm z_4731 = null;
      IStrategoTerm a_4732 = null;
      IStrategoTerm b_4732 = null;
      IStrategoTerm c_4732 = null;
      IStrategoTerm i_4732 = null;
      IStrategoTerm j_4732 = null;
      IStrategoTerm l_4732 = null;
      IStrategoTerm m_4732 = null;
      IStrategoTerm n_4732 = null;
      IStrategoTerm e_4732 = null;
      IStrategoTerm f_4732 = null;
      IStrategoTerm q_4732 = null;
      IStrategoTerm r_4732 = null;
      IStrategoTerm t_4732 = null;
      IStrategoTerm u_4732 = null;
      IStrategoTerm v_4732 = null;
      z_4731 = term;
      b_4732 = term;
      term = trans.const4472;
      c_4732 = trans.const4472;
      l_4732 = term;
      i_4732 = trans.const4473;
      m_4732 = l_4732;
      j_4732 = trans.constCons2047;
      n_4732 = m_4732;
      term = termFactory.makeTuple(trans.const4474, c_4732);
      term = dr_set_rule_0_3.instance.invoke(context, n_4732, i_4732, j_4732, term);
      if(term == null)
        break Fail22808;
      term = b_4732;
      e_4732 = b_4732;
      term = project_path_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22808;
      f_4732 = term;
      t_4732 = term;
      q_4732 = trans.const4475;
      u_4732 = t_4732;
      r_4732 = trans.constCons2047;
      v_4732 = u_4732;
      term = termFactory.makeTuple(trans.const4476, f_4732);
      term = dr_set_rule_0_3.instance.invoke(context, v_4732, q_4732, r_4732, term);
      if(term == null)
        break Fail22808;
      term = try_1_0.instance.invoke(context, e_4732, get_source_base_dir_0_0.instance);
      if(term == null)
        break Fail22808;
      term = map_1_0.instance.invoke(context, z_4731, basic_desugar_top_0_0.instance);
      if(term == null)
        break Fail22808;
      a_4732 = term;
      term = declare_globals_0_0.instance.invoke(context, trans.constImport0);
      if(term == null)
        break Fail22808;
      term = ensure_imports_0_0.instance.invoke(context, a_4732);
      if(term == null)
        break Fail22808;
      term = analyze_names_in_asts_0_0.instance.invoke(context, a_4732);
      if(term == null)
        break Fail22808;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}