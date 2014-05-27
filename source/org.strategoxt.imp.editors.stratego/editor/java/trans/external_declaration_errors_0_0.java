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
    Fail21394:
    { 
      IStrategoTerm l_4193 = null;
      TermReference m_4193 = new TermReference();
      IStrategoTerm r_4193 = null;
      IStrategoTerm s_4193 = null;
      IStrategoTerm t_4193 = null;
      IStrategoTerm u_4193 = null;
      TermReference x_4499 = new TermReference();
      TermReference y_4499 = new TermReference();
      IStrategoTerm c_4500 = null;
      IStrategoTerm d_4500 = null;
      IStrategoTerm z_4499 = null;
      IStrategoTerm a_4500 = null;
      if(m_4193.value == null)
        m_4193.value = term;
      else
        if(m_4193.value != term && !m_4193.value.match(term))
          break Fail21394;
      term = project_path_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21394;
      t_4193 = term;
      r_4193 = trans.const4257;
      term = t_4193;
      u_4193 = t_4193;
      term = dirs_with_generated_files_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21394;
      s_4193 = term;
      c_4500 = u_4193;
      term = r_4193;
      if(x_4499.value == null)
        x_4499.value = term;
      else
        if(x_4499.value != term && !x_4499.value.match(term))
          break Fail21394;
      d_4500 = c_4500;
      term = s_4193;
      if(y_4499.value == null)
        y_4499.value = term;
      else
        if(y_4499.value != term && !y_4499.value.match(term))
          break Fail21394;
      z_4499 = d_4500;
      term = z_4499;
      lifted6530 lifted65300 = new lifted6530();
      lifted6529 lifted65290 = new lifted6529();
      lifted65300.y_4499 = y_4499;
      lifted65290.x_4499 = x_4499;
      term = get_source_files_2_0.instance.invoke(context, term, lifted65290, lifted65300);
      if(term == null)
        break Fail21394;
      a_4500 = term;
      term = a_4500;
      lifted6531 lifted65310 = new lifted6531();
      lifted65310.m_4193 = m_4193;
      term = filter_1_0.instance.invoke(context, term, lifted65310);
      if(term == null)
        break Fail21394;
      l_4193 = term;
      if(m_4193.value == null)
        break Fail21394;
      term = m_4193.value;
      Success11477:
      { 
        Fail21395:
        { 
          term = declared_in_external_lib_0_0.instance.invoke(context, term);
          if(term == null)
            break Fail21395;
          term = (IStrategoTerm)termFactory.makeListCons(term, (IStrategoList)trans.constNil3);
          if(true)
            break Success11477;
        }
        term = trans.constNil3;
      }
      term = termFactory.makeTuple(l_4193, term);
      term = conc_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail21394;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}