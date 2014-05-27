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

@SuppressWarnings("all") public class external_declaration_errors_0_0 extends Strategy 
{ 
  public static external_declaration_errors_0_0 instance = new external_declaration_errors_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("external_declaration_errors_0_0");
    Fail22870:
    { 
      IStrategoTerm d_4747 = null;
      TermReference e_4747 = new TermReference();
      IStrategoTerm j_4747 = null;
      IStrategoTerm k_4747 = null;
      IStrategoTerm l_4747 = null;
      IStrategoTerm m_4747 = null;
      TermReference p_5053 = new TermReference();
      TermReference q_5053 = new TermReference();
      IStrategoTerm u_5053 = null;
      IStrategoTerm v_5053 = null;
      IStrategoTerm r_5053 = null;
      IStrategoTerm s_5053 = null;
      if(e_4747.value == null)
        e_4747.value = term;
      else
        if(e_4747.value != term && !e_4747.value.match(term))
          break Fail22870;
      term = project_path_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22870;
      l_4747 = term;
      j_4747 = trans.const4467;
      term = l_4747;
      m_4747 = l_4747;
      term = dirs_with_generated_files_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22870;
      k_4747 = term;
      u_5053 = m_4747;
      term = j_4747;
      if(p_5053.value == null)
        p_5053.value = term;
      else
        if(p_5053.value != term && !p_5053.value.match(term))
          break Fail22870;
      v_5053 = u_5053;
      term = k_4747;
      if(q_5053.value == null)
        q_5053.value = term;
      else
        if(q_5053.value != term && !q_5053.value.match(term))
          break Fail22870;
      r_5053 = v_5053;
      term = r_5053;
      lifted6801 lifted68010 = new lifted6801();
      lifted6800 lifted68000 = new lifted6800();
      lifted68010.q_5053 = q_5053;
      lifted68000.p_5053 = p_5053;
      term = get_source_files_2_0.instance.invoke(context, term, lifted68000, lifted68010);
      if(term == null)
        break Fail22870;
      s_5053 = term;
      term = s_5053;
      lifted6802 lifted68020 = new lifted6802();
      lifted68020.e_4747 = e_4747;
      term = filter_1_0.instance.invoke(context, term, lifted68020);
      if(term == null)
        break Fail22870;
      d_4747 = term;
      if(e_4747.value == null)
        break Fail22870;
      term = e_4747.value;
      Success12186:
      { 
        Fail22871:
        { 
          term = declared_in_external_lib_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail22871;
          term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil4);
          if(true)
            break Success12186;
        }
        term = trans.constNil4;
      }
      term = termFactory.makeTuple(d_4747, term);
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail22870;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}