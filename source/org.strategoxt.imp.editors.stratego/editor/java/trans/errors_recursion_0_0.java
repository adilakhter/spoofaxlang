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
    Fail21304:
    { 
      IStrategoTerm r_4171 = null;
      r_4171 = term;
      if(term.getTermType() != IStrategoTerm.APPL || Main._consSDefT_4 != ((IStrategoAppl)term).getConstructor())
        break Fail21304;
      IStrategoTerm arg7592 = term.getSubterm(0);
      IStrategoList annos665 = arg7592.getAnnotations();
      if(annos665.getTermType() != IStrategoTerm.LIST || ((IStrategoList)annos665).isEmpty())
        break Fail21304;
      IStrategoTerm arg7593 = ((IStrategoList)annos665).tail();
      if(arg7593.getTermType() != IStrategoTerm.LIST || !((IStrategoList)arg7593).isEmpty())
        break Fail21304;
      term = is_recursive_declaration_0_0.instance.invoke(context, r_4171);
      if(term == null)
        break Fail21304;
      term = (IStrategoTerm)termFactory.makeListCons(termFactory.makeTuple(r_4171, trans.const4246), (IStrategoList)trans.constNil3);
      context.popOnSuccess();
      if(true)
        return term;
    }
    context.popOnFailure();
    return null;
  }
}