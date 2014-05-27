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

@SuppressWarnings("all") public class alt2prodrule_0_0 extends Strategy 
{ 
  public static alt2prodrule_0_0 instance = new alt2prodrule_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("alt2prodrule_0_0");
    Fail25623:
    { 
      IStrategoTerm l_4242 = null;
      IStrategoTerm m_4242 = null;
      IStrategoTerm n_4242 = null;
      IStrategoTerm o_4242 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consprod_3 != ((IStrategoAppl)term).getConstructor())
        break Fail25623;
      n_4242 = term.getSubterm(0);
      l_4242 = term.getSubterm(1);
      term = is_alt_symbol_0_0.instance.invoke(context, l_4242);
      if(term == null)
        break Fail25623;
      term = get_nonterm_of_0_0.instance.invoke(context, l_4242);
      if(term == null)
        break Fail25623;
      m_4242 = term;
      term = syms2trees_0_0.instance.invoke(context, n_4242);
      if(term == null)
        break Fail25623;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail25623;
      o_4242 = ((IStrategoList)term).head();
      IStrategoTerm arg6050 = ((IStrategoList)term).tail();
      if(arg6050.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg6050).isEmpty())
        break Fail25623;
      term = termFactory.makeAppl(SpoofaxGenerator._consProdRule_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consNonterm_1, new IStrategoTerm[]{m_4242}), (IStrategoTerm)termFactory.makeListCons(o_4242, (IStrategoList)generator.constNil7)});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}