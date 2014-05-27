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

@SuppressWarnings("all") public class context_free_syntax_error_0_0 extends Strategy 
{ 
  public static context_free_syntax_error_0_0 instance = new context_free_syntax_error_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("context_free_syntax_error_0_0");
    Fail76076:
    { 
      IStrategoTerm q_92073 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consprod_3 != ((IStrategoAppl)term).getConstructor())
        break Fail76076;
      IStrategoTerm arg26177 = term.getSubterm(0);
      if(arg26177.getTermType() != IStrategoTerm.LIST || ((IStrategoList)arg26177).isEmpty())
        break Fail76076;
      IStrategoTerm arg26178 = ((IStrategoList)arg26177).tail();
      if(arg26178.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg26178).isEmpty())
        break Fail76076;
      IStrategoTerm arg26179 = term.getSubterm(2);
      if(arg26179.getTermType() != IStrategoTerm.APPL || Main._consattrs_1 != ((IStrategoAppl)arg26179).getConstructor())
        break Fail76076;
      q_92073 = arg26179.getSubterm(0);
      term = SRTS_one.instance.invoke(context, q_92073, bracket_0_0.instance);
      if(term == null)
        break Fail76076;
      term = concat_strings_0_0.instance.invoke(context, trans.constCons7225);
      if(term == null)
        break Fail76076;
      term = termFactory.makeTuple(q_92073, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11)));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}