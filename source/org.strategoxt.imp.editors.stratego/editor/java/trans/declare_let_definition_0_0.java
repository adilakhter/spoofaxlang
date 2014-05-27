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

@SuppressWarnings("all") public class declare_let_definition_0_0 extends Strategy 
{ 
  public static declare_let_definition_0_0 instance = new declare_let_definition_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("declare_let_definition_0_0");
    Fail23195:
    { 
      TermReference c_4802 = new TermReference();
      TermReference d_4802 = new TermReference();
      TermReference e_4802 = new TermReference();
      TermReference f_4802 = new TermReference();
      TermReference g_4802 = new TermReference();
      TermReference h_4802 = new TermReference();
      TermReference i_4802 = new TermReference();
      TermReference j_4802 = new TermReference();
      IStrategoTerm m_4802 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consSDefT_4 != ((IStrategoAppl)term).getConstructor())
        break Fail23195;
      if(c_4802.value == null)
        c_4802.value = term.getSubterm(0);
      else
        if(c_4802.value != term.getSubterm(0) && !c_4802.value.match(term.getSubterm(0)))
          break Fail23195;
      if(e_4802.value == null)
        e_4802.value = term.getSubterm(1);
      else
        if(e_4802.value != term.getSubterm(1) && !e_4802.value.match(term.getSubterm(1)))
          break Fail23195;
      if(g_4802.value == null)
        g_4802.value = term.getSubterm(2);
      else
        if(g_4802.value != term.getSubterm(2) && !g_4802.value.match(term.getSubterm(2)))
          break Fail23195;
      if(i_4802.value == null)
        i_4802.value = term.getSubterm(3);
      else
        if(i_4802.value != term.getSubterm(3) && !i_4802.value.match(term.getSubterm(3)))
          break Fail23195;
      m_4802 = term;
      IStrategoTerm term12524 = term;
      Success12426:
      { 
        Fail23196:
        { 
          lifted6898 lifted68980 = new lifted6898();
          lifted6897 lifted68970 = new lifted6897();
          lifted68980.c_4802 = c_4802;
          lifted68980.d_4802 = d_4802;
          lifted68980.e_4802 = e_4802;
          lifted68980.f_4802 = f_4802;
          lifted68980.g_4802 = g_4802;
          lifted68980.h_4802 = h_4802;
          lifted68980.i_4802 = i_4802;
          lifted68980.j_4802 = j_4802;
          lifted68970.e_4802 = e_4802;
          lifted68970.g_4802 = g_4802;
          term = dr_scope_declare_cookies_2_0.instance.invoke(context, term, lifted68970, lifted68980);
          if(term == null)
            break Fail23196;
          if(true)
            break Success12426;
        }
        term = term12524;
        IStrategoTerm k_4802 = null;
        IStrategoTerm l_4802 = null;
        IStrategoTerm q_4802 = null;
        k_4802 = term;
        term = context.invokePrimitive("SSL_stacktrace_get_all_frame_names", term, NO_STRATEGIES, NO_TERMS);
        if(term == null)
          break Fail23195;
        l_4802 = term;
        q_4802 = k_4802;
        term = report_with_failure_0_2.instance.invoke(context, q_4802, trans.const4603, l_4802);
        if(term == null)
          break Fail23195;
      }
      term = m_4802;
      if(d_4802.value == null || (f_4802.value == null || (h_4802.value == null || j_4802.value == null)))
        break Fail23195;
      term = termFactory.makeAppl(Main._consSDefT_4, new IStrategoTerm[]{d_4802.value, f_4802.value, h_4802.value, j_4802.value});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}