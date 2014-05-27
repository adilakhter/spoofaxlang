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

@SuppressWarnings("all") public class seq2prodrule_0_0 extends Strategy 
{ 
  public static seq2prodrule_0_0 instance = new seq2prodrule_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("seq2prodrule_0_0");
    Fail25622:
    { 
      IStrategoTerm f_4242 = null;
      IStrategoTerm g_4242 = null;
      IStrategoTerm h_4242 = null;
      IStrategoTerm i_4242 = null;
      if(term.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consprod_3 != ((IStrategoAppl)term).getConstructor())
        break Fail25622;
      h_4242 = term.getSubterm(0);
      f_4242 = term.getSubterm(1);
      term = is_seq_symbol_0_0.instance.invoke(context, f_4242);
      if(term == null)
        break Fail25622;
      term = get_nonterm_of_0_0.instance.invoke(context, f_4242);
      if(term == null)
        break Fail25622;
      g_4242 = term;
      term = syms2trees_0_0.instance.invoke(context, h_4242);
      if(term == null)
        break Fail25622;
      i_4242 = term;
      term = length_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25622;
      term = int_to_string_0_0.instance.invoke(context, term);
      if(term == null)
        break Fail25622;
      term = termFactory.makeAppl(SpoofaxGenerator._consProdRule_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consNonterm_1, new IStrategoTerm[]{g_4242}), (IStrategoTerm)termFactory.makeListCons(termFactory.makeAppl(SpoofaxGenerator._consAppl_2, new IStrategoTerm[]{termFactory.makeAppl(SpoofaxGenerator._consTupleTerm_1, new IStrategoTerm[]{term}), i_4242}), (IStrategoList)generator.constNil7)});
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}