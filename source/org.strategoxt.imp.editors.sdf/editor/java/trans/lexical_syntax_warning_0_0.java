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

@SuppressWarnings("all") public class lexical_syntax_warning_0_0 extends Strategy 
{ 
  public static lexical_syntax_warning_0_0 instance = new lexical_syntax_warning_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("lexical_syntax_warning_0_0");
    Fail76075:
    { 
      IStrategoTerm l_92073 = null;
      l_92073 = term;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consterm_1 != ((IStrategoAppl)term).getConstructor())
        break Fail76075;
      IStrategoTerm arg26173 = term.getSubterm(0);
      if(arg26173.getTermType() != IStrategoTerm.APPL || Main._consdefault_1 != ((IStrategoAppl)arg26173).getConstructor())
        break Fail76075;
      IStrategoTerm arg26174 = arg26173.getSubterm(0);
      if(arg26174.getTermType() != IStrategoTerm.APPL || Main._consappl_2 != ((IStrategoAppl)arg26174).getConstructor())
        break Fail76075;
      IStrategoTerm arg26175 = arg26174.getSubterm(0);
      if(arg26175.getTermType() != IStrategoTerm.APPL || Main._consunquoted_1 != ((IStrategoAppl)arg26175).getConstructor())
        break Fail76075;
      IStrategoTerm arg26176 = arg26175.getSubterm(0);
      if(arg26176.getTermType() != IStrategoTerm.STRING || !"cons".equals(((IStrategoString)arg26176).stringValue()))
        break Fail76075;
      term = concat_strings_0_0.instance.invoke(context, trans.constCons7224);
      if(term == null)
        break Fail76075;
      term = termFactory.makeTuple(l_92073, termFactory.annotateTerm(term, checkListAnnos(termFactory, trans.constNil11)));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}