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

@SuppressWarnings("all") final class lifted21566 extends Strategy 
{ 
  public static final lifted21566 instance = new lifted21566();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail76412:
    { 
      IStrategoTerm c_92073 = null;
      IStrategoTerm d_92073 = null;
      IStrategoTerm e_92073 = null;
      IStrategoTerm f_92073 = null;
      IStrategoTerm g_92073 = null;
      if(term.getTermType() != IStrategoTerm.LIST || ((IStrategoList)term).isEmpty())
        break Fail76412;
      c_92073 = ((IStrategoList)term).head();
      d_92073 = ((IStrategoList)term).tail();
      IStrategoList annos2355 = term.getAnnotations();
      g_92073 = annos2355;
      term = fun_1_0.instance.invoke(context, c_92073, lifted21567.instance);
      if(term == null)
        break Fail76412;
      e_92073 = term;
      term = d_92073;
      if(term.getTermType() != IStrategoTerm.LIST || !((IStrategoList)term).isEmpty())
        break Fail76412;
      f_92073 = term;
      IStrategoList list661;
      list661 = checkListTail(f_92073);
      if(list661 == null)
        break Fail76412;
      term = termFactory.annotateTerm((IStrategoTerm)termFactory.makeListCons(e_92073, list661), checkListAnnos(termFactory, g_92073));
      if(true)
        return term;
    }
    return null;
  }
}