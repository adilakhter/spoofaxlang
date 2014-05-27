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

@SuppressWarnings("all") public class get_prolog_lines_0_0 extends Strategy 
{ 
  public static get_prolog_lines_0_0 instance = new get_prolog_lines_0_0();

  @Override public IStrategoTerm invoke(Context context, IStrategoTerm term)
  { 
    ITermFactory termFactory = context.getFactory();
    Fail25432:
    { 
      IStrategoTerm term10028 = term;
      IStrategoConstructor cons323 = term.getTermType() == IStrategoTerm.APPL ? ((IStrategoAppl)term).getConstructor() : null;
      Success10028:
      { 
        if(cons323 == SpoofaxGenerator._consSome_1)
        { 
          Fail25433:
          { 
            IStrategoTerm z_4218 = null;
            IStrategoTerm arg5839 = term.getSubterm(0);
            z_4218 = arg5839;
            if(arg5839.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consXMLDecl_3 != ((IStrategoAppl)arg5839).getConstructor())
              break Fail25433;
            term = (IStrategoTerm)termFactory.makeListCons(z_4218, (IStrategoList)generator.constNil7);
            if(true)
              break Success10028;
          }
          term = term10028;
        }
        Success10029:
        { 
          if(cons323 == SpoofaxGenerator._consNone_0)
          { 
            Fail25434:
            { 
              term = generator.constNil7;
              if(true)
                break Success10029;
            }
            term = term10028;
          }
          if(cons323 == SpoofaxGenerator._consSome_1)
          { 
            IStrategoTerm x_4218 = null;
            IStrategoTerm y_4218 = null;
            IStrategoTerm arg5843 = term.getSubterm(0);
            if(arg5843.getTermType() != IStrategoTerm.APPL || SpoofaxGenerator._consDocTypePrologue_2 != ((IStrategoAppl)arg5843).getConstructor())
              break Fail25432;
            x_4218 = arg5843.getSubterm(0);
            y_4218 = arg5843.getSubterm(1);
            IStrategoList list362;
            list362 = checkListTail(y_4218);
            if(list362 == null)
              break Fail25432;
            term = (IStrategoTerm)termFactory.makeListCons(x_4218, list362);
          }
          else
          { 
            break Fail25432;
          }
        }
      }
      if(true)
        return term;
    }
    context.push("get_prolog_lines_0_0");
    context.popOnFailure();
    return null;
  }
}