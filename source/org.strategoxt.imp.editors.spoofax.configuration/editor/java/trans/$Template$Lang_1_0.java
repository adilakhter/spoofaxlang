package trans;

import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_lib.*;
import org.strategoxt.stratego_sglr.*;
import org.strategoxt.stratego_gpp.*;
import org.strategoxt.stratego_xtc.*;
import org.strategoxt.stratego_aterm.*;
import org.strategoxt.java_front.*;
import org.strategoxt.imp.editors.spoofax.configuration.strategies.*;
import org.strategoxt.lang.*;
import org.spoofax.interpreter.terms.*;
import static org.strategoxt.lang.Term.*;
import org.spoofax.interpreter.library.AbstractPrimitive;
import java.util.ArrayList;
import java.lang.ref.WeakReference;

@SuppressWarnings("all") public class $Template$Lang_1_0 extends Strategy 
{ 
  public static $Template$Lang_1_0 instance = new $Template$Lang_1_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term, Strategy r_4632)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("TemplateLang_1_0");
    Fail22942:
    { 
      IStrategoTerm u_4732 = null;
      IStrategoTerm t_4732 = null;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consTemplateLang_1 != ((IStrategoAppl)term).getConstructor())
        break Fail22942;
      t_4732 = term.getSubterm(0);
      IStrategoList annos707 = term.getAnnotations();
      u_4732 = annos707;
      term = r_4632.invoke(context, t_4732);
      if(term == null)
        break Fail22942;
      term = termFactory.annotateTerm(termFactory.makeAppl(Main._consTemplateLang_1, new IStrategoTerm[]{term}), checkListAnnos(termFactory, u_4732));
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}