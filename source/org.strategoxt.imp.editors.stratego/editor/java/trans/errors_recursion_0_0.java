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

@SuppressWarnings("all") public class errors_recursion_0_0 extends Strategy 
{ 
  public static errors_recursion_0_0 instance = new errors_recursion_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    context.push("errors_recursion_0_0");
    Fail22780:
    { 
      IStrategoTerm j_4725 = null;
      j_4725 = term;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consSDefT_4 != ((IStrategoAppl)term).getConstructor())
        break Fail22780;
      IStrategoTerm arg8059 = term.getSubterm(0);
      IStrategoList annos693 = arg8059.getAnnotations();
      if(annos693.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos693).isEmpty())
        break Fail22780;
      IStrategoTerm arg8060 = ((IStrategoList)annos693).tail();
      if(arg8060.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg8060).isEmpty())
        break Fail22780;
      term = is_recursive_declaration_0_0.instance.invoke(context, j_4725);
      if(term == null)
        break Fail22780;
      term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(j_4725, trans.const4456), (IStrategoList)trans.constNil4);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}