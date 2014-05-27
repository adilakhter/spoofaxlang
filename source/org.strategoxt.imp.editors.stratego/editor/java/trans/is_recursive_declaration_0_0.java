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

@SuppressWarnings("all") public class is_recursive_declaration_0_0 extends Strategy 
{ 
  public static is_recursive_declaration_0_0 instance = new is_recursive_declaration_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    context.push("is_recursive_declaration_0_0");
    Fail22781:
    { 
      IStrategoTerm l_4725 = null;
      TermReference m_4725 = new TermReference();
      TermReference n_4725 = new TermReference();
      l_4725 = term;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consSDefT_4 != ((IStrategoAppl)term).getConstructor())
        break Fail22781;
      IStrategoTerm arg8064 = term.getSubterm(0);
      if(m_4725.value == null)
        m_4725.value = arg8064;
      else
        if(m_4725.value != arg8064 && !m_4725.value.match(arg8064))
          break Fail22781;
      IStrategoList annos694 = arg8064.getAnnotations();
      if(annos694.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos694).isEmpty())
        break Fail22781;
      if(n_4725.value == null)
        n_4725.value = ((IStrategoList)annos694).head();
      else
        if(n_4725.value != ((IStrategoList)annos694).head() && !n_4725.value.match(((IStrategoList)annos694).head()))
          break Fail22781;
      IStrategoTerm arg8065 = ((IStrategoList)annos694).tail();
      if(arg8065.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8065).isEmpty())
        break Fail22781;
      term = l_4725;
      lifted6724 lifted67240 = new lifted6724();
      lifted67240.m_4725 = m_4725;
      lifted67240.n_4725 = n_4725;
      term = oncetd_1_0.instance.invoke(context, term, lifted67240);
      if(term == null)
        break Fail22781;
      term = l_4725;
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}